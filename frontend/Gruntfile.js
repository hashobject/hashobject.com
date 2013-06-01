module.exports = function(grunt) {

  // Project configuration.
  grunt.initConfig({
    pkg: grunt.file.readJSON('package.json'),
    aws: grunt.file.readJSON('grunt-aws.json'), // for S3

    stylus: {
      compile: {
        options: {
          paths: ['styl'], // folder, where files to be imported are located
          urlfunc: 'url', // use embedurl('test.png') in our code to trigger Data URI embedding
          'include css': true
        },
        files: {
          '../resources/public/css/app.css': 'styl/app.styl' // 1:1 compile
        }
      }
    },

    s3: {
      key: '<%= aws.key %>',
      secret: '<%= aws.secret %>',
      bucket: '<%= aws.bucket %>',
      access: 'public-read',
      encodePaths: true,
      //debug: true,

      // Files to be uploaded.
      upload: [

      ]
    },

    watch: {
      src: {
        files: ['styl/*.styl'],
        tasks: ['build']
      }
    }

  });

  grunt.loadNpmTasks('grunt-contrib-stylus');
  grunt.loadNpmTasks('grunt-s3');
  grunt.loadNpmTasks('grunt-contrib-watch');

  grunt.registerTask('build', ['stylus:compile']);
  grunt.registerTask('deploy', ['stylus:compile', 's3:upload']);

};
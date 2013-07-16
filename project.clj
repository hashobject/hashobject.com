(defproject hashobject "0.1.0"
  :description "Hashobject team official site. Generated using Clojure. Hosted on Amazon S3."
  :url "http://hashobject.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [hiccup "1.0.3"]]
  :plugins [[lein-shell "0.1.0"]]
  :aliases {"html" ["trampoline" "run" "-m" "hashobject.generator/generate"]
            "site-build" ["shell" "./frontend/node_modules/grunt-cli/bin/grunt" "--gruntfile" "frontend/Gruntfile.js" "build"]
            "site-deploy" ["shell" "./frontend/node_modules/grunt-cli/bin/grunt" "--gruntfile" "frontend/Gruntfile.js" "deploy"]})

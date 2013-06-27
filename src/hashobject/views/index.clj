(ns hashobject.views.index
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css include-js)]))


(defn ga[]
  [:script "(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-41533076-1', 'hashobject.com');
  ga('send', 'pageview');"])


(defn index []
  (html5 {:lang "en"}
    [:head
      [:meta {:charset "utf-8"}]
      [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0, user-scalable=no"}]
      [:meta {:itemprop "author" :name "author" :content "HashObject (team@hashobject.com)"}]
      [:meta {:name "keywords" :itemprop "keywords" :content "HashObject, hashobject, #{hash:object}, HashObject Team, HashObject Ltd"}]
      [:meta {:name "description" :itemprop "description" :content "HashObject - software engineering, design and application development"}]
      [:title "HashObject: we love development"]
      [:link {:rel "shortcut icon" :href "/favicon.ico"}]
      (include-css "/css/app.css")
      (ga)]
    [:body "Our site will be here soon..."]     ))

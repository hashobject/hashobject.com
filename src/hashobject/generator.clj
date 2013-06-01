(ns hashobject.generator
  (:use clojure.java.io)
  (:require [hashobject.views.index :as index-view]))


(defn generate []
  (spit (str "./resources/public/index.html") (index-view/index)))



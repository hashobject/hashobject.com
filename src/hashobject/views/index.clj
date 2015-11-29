(ns hashobject.views.index
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css include-js)]))

(defn render [context]
  (html5 {:lang "en"}
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:content "IE=edge,chrome=1", :http-equiv "X-UA-Compatible"}]
     [:meta {:content "width=device-width, initial-scale=1.0, user-scalable=no", :name "viewport"}]
     [:meta {:content "Hashobject (team@hashobject.com)", :itemprop "author", :name "author"}]
     [:meta {:content "hashobject, hashobject team, hashobject ltd", :itemprop "keywords", :name "keywords"}]
     [:meta {:content "Hashobject - software engineering, design and application development", :itemprop "description", :name "description"}]
     [:title "Hashobject: we love development"]
     [:link {:href "/favicon.png", :rel "icon", :type "image/png"}]
     [:link {:rel "author", :href "humans.txt"}]
     [:link {:href "https://fonts.googleapis.com/css?family=PT+Sans:400,700,400italic", :rel "stylesheet", :type "text/css"}]
     (include-css "/css/app.css")]
   [:body
    [:img {:class "logo", :src "/images/hashobject-logo.svg"}]
    [:div {:id "landing"}
     [:p "Hi there:)"
      [:br]
      [:span "Hashobject"] " is a team of 2 people:"]
     [:section {:class "team"}
      [:div {:id "anton"}
       [:img {:src "/images/anton.png"}]
       [:div {:class "details"}
        [:strong {:class "uppercase"}
         [:a {:href "https://twitter.com/podviaznikov"} "Anton Podviaznikov"] ]
        [:br] "Full-stack developer"] ]
      [:div {:id "maryna"}
       [:img {:src "/images/maryna.png"}]
       [:div {:class "details"}
        [:strong {:class "uppercase"}
         [:a {:href "https://twitter.com/m_aleksandrova"} "Maryna Aleksandrova"] ]
        [:br] "Designer"] ] ]
     [:p "We are still trying to figure out what to put on our website,"
      [:br] "so ... better check out our blog at "
      [:a {:href "http://blog.hashobject.com/"} "blog.hashobject.com"]
      [:br] "or "
      [:a {:href "http://code.hashobject.com/"} "open source corner"] " with Clojure libraries."
      [:br] "or start following us on "
      [:span {:class "uppercase"} "Twitter"] " or "
      [:span {:class "uppercase"} "GitHub"] "."
      [:br] "If you need help with design or development send us and "
      [:a {:href "mailto:team@hashobject.com"} "email"]]
     [:div {:class "button-group"}
      [:a {:class "twitter big button", :href "https://twitter.com/hashobject"}]
      [:a {:class "github big button", :href "https://github.com/hashobject"}] ]
     [:div {:class "credentials"} "Background image is by "
      [:a {:href "http://doctype.me/", :target "_blank"} "Aleks Dorohovich"] ", found on "
      [:a {:href "http://unsplash.com/", :target "_blank"} "unsplash.com"]]
      ]]
     ))

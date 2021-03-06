(defproject clj-hh "0.1.0"
  :description      "Website of the clojure group hamburg"
  :repositories     {"snapshots" "http://maven.prettyrandom.net/"
                     "releases"  "http://maven.prettyrandom.net/"}
  :dependencies     [[org.clojure/clojure "1.2.0"]
                     [org.clojure/clojure-contrib "1.2.0"]
                     [clj-gae-datastore "0.3.0"]
                     [compojure "0.6.2"]
                     [ring/ring-core "0.3.7"]
                     [com.google/soy-clj "20100708"]]
                     [com.google/soy-to-js-src "20100708"]
                     [com.google/closure-compiler "20110119"]
  :dev-dependencies [[com.google.appengine/appengine-local-runtime "1.4.0"]
                     [marginalia "0.5.0"]
                     [swank-clojure "1.2.1"]
                     [lein-ring "0.3.3"]
                     [lein-gae "0.1.0"]
                     [ring-mock "0.1.1"]
                     [midje "1.1"]
                     [leiningen-midje "1.0.0-SNAPSHOT"]
                     [lein-goog "0.1.0"]
                     [com.google/soy-to-js-src "20100708"]
                     [com.google/closure-compiler "20110119"]]
  :ring             {:handler            net.cljhh.core/clj-hh-routes
                     :servlet-class      net.cljhh.servlet
                     :servlet-name       "CljHH"
                     :context-path       "/*"
                     :servlet-path-info? true}
  :goog             {:src-files           ["user.js"]
                     :deps-compiler       "build/closure/calcdeps.py"
                     :javascript-compiler "lib/closure-compiler-20110119.jar"
                     :javascript-input    "web/js"
                     :javascript-output   "war/js"
                     :template-compiler   "lib/soy-to-js-src-20100708.jar"
                     :template-input      "web/templates"
                     :template-output     "web/js"
                     :template-prefix     "templates-"}
  :gae              {:resources  ["web/WEB-INF" "web/templates" "web/css"]}
  :resources-path   "war")

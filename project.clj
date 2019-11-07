(defproject komcrad/lein-autoreload "0.2.0"
  :description "When running the repl, reload every time a file is saved."
  :url "https://github.com/wsbu/lein-autoreload"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [
    [leiningen-core "2.7.0"]
    [ns-tracker "0.3.1"]
    [org.clojure/clojure "1.10.0"]]
  :deploy-repositories [["releases" {:url "https://mvn.redlion.net/repository/maven-releases"
                                     :sign-releases false}]
                        ["snapshots" {:url "https://mvn.redlion.net/repository/maven-snapshots"
                                      :sign-releases false}]])

(defproject clomacs "0.1.0-SNAPSHOT"
  :description "Simplifies emacs lisp interaction with clojure."
  :url "https://github.com/kostafey/clomacs"
  :license {:name "General Public License 3"
            :url "http://www.gnu.org/licenses/gpl-2.0.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.tcrawley/dynapath "0.2.3"]
                 [org.sonatype.aether/aether-util "1.13.1"]
                 [org.sonatype.aether/aether-spi "1.13.1"]
                 [org.sonatype.aether/aether-impl "1.13.1"]
                 [org.sonatype.sisu/sisu-guice "3.0.3" :classifier "no_aop"
                  :exclusions [[javax.inject] [aopalliance]]]
                 [org.sonatype.sisu/sisu-inject-bean "2.2.3"]
                 [org.sonatype.sisu/sisu-inject-plexus "2.2.3"]
                 [org.codehaus.plexus/plexus-utils "2.0.7"]
                 [org.codehaus.plexus/plexus-classworlds "2.4"]
                 [org.sonatype.aether/aether-connector-wagon "1.13.1"]
                 [org.sonatype.aether/aether-connector-file "1.13.1"]
                 [org.sonatype.aether/aether-api "1.13.1"]
                 [org.clojure/clojure "1.3.0"]
                 [org.codehaus.plexus/plexus-component-annotations "1.5.5"
                  :exclusions [[junit]]]
                 [org.apache.maven/maven-repository-metadata "3.0.4"]
                 [org.apache.maven/maven-model "3.0.4"]
                 [org.codehaus.plexus/plexus-interpolation "1.14"]
                 [org.apache.maven/maven-model-builder "3.0.4"]
                 [org.apache.maven/maven-aether-provider "3.0.4"]
                 [org.apache.maven.wagon/wagon-provider-api "2.2"]
                 [org.jsoup/jsoup "1.6.1"]
                 [commons-logging "1.1.1"]
                 [commons-io "2.0.1"]
                 [org.apache.maven.wagon/wagon-http-shared4 "2.2"]
                 [org.apache.httpcomponents/httpcore "4.1.2"]
                 [commons-codec "1.4"]
                 [org.apache.httpcomponents/httpclient "4.1.2"]
                 [org.apache.maven.wagon/wagon-http "2.2"]
                 [com.cemerick/pomegranate "0.2.0"]
                 [leiningen-core "2.1.3"]])

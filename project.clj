(defproject program ""

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/core.async "1.1.587"]

                 [org.apache.kafka/kafka-clients "2.4.0"]
                 [org.apache.kafka/kafka-streams "2.4.0"
                  :exclusions [org.rocksdb/rocksdbjni]]
                 [org.rocksdb/rocksdbjni "6.5.3"]

                 [juxt/crux-core "20.03-1.8.0-alpha"]
                 [juxt/crux-rocksdb "20.03-1.8.0-alpha"
                  :exclusions [org.rocksdb/rocksdbjni]]
                 [juxt/crux-kafka "20.03-1.8.0-alpha"
                  :exclusions [org.apache.kafka/kafka-clients]]

                 [org.clojure/test.check "1.1.1"]]

  :source-paths ["src"]
  :target-path "out"
  :jvm-options ["-Dclojure.compiler.direct-linking=true"]

  :main Bombur.streams
  :repl-options {:init-ns Bombur.streams})
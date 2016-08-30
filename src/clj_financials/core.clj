(ns clj-financials.core
  (:require [clj-http.client :as client])
  (:gen-class))

(comment(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")))


(client/get "https://services.last10k.com/v1/company/slw/quote"
            {:headers {"Ocp-Apim-Subscription-Key" "baf26a417a8249e9a0e9dfc331e486c8"}})

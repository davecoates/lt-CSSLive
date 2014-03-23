(ns lt.plugins.CSSLive
  (:require  [lt.object :as object])
  (:require-macros [lt.macros :refer [behavior]]))


(behavior ::css-change
          :triggers #{:change}
          :reaction (fn [this]
                      (object/raise this :eval.one)))

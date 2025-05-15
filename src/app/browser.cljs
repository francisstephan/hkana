(ns app.browser
  (:require [reagent.core :as r]
            [app.trans]
            [app.clipboard :as clip]))

(defn atom-input [value]
  [:input {:type "text"
           :class "small"
           :id "entree"
           :auto-focus true
           :size 120
           :on-change #(reset! value (-> % .-target .-value app.trans/transl))}])

(defn browser []
  (let [val (r/atom "")]
    (fn []
      [:div
        [:p "Type romazi: " [:input {:type "button" :class "rebut" :value "   Reset   "
                                     :on-click #(do
                                                  (.focus (.getElementById js/document "entree" ))
                                                  (reset! val "" )
                                                  (set! (.-value (.getElementById js/document "entree" ))  "" ) ) }]
                            [:input {:type "button" :class "rebut" :value "Copy hiragana to clipboard"
                                     :on-click #(clip/copyTextToClipboard  @val)}]
                            [:br]
                            [atom-input val]]
        [:p "Get hiragana text : "]
        [:p {:class "convert" }  [:br] @val]
      ])))

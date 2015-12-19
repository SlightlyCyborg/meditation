(ns meditation.core)
(use '[clojure.java.shell :only  [sh]])

(defn to-breath
  "Inhale & Exhale"
  []
  "Take a deep breath")

(defn tell-me [x user]
  (if (instance? java.lang.String x)
  (sh "say" (str "-v" user) x ) 
  (sh "say" (str "-v" user) (x))))

(defmacro destruct-args [x]
  (if (instance? clojure.lang.Symbol (last x))
  (concat (list (first x) (second x)) (eval (last x)))  
  (concat (list (first x) (second x)) (last x))))

(defmacro Vicki [x y]
  (list x y "Vicki" ))

(defmacro Fred [x y]
  (list x y "Fred" ))

(Vicki tell-me to-breath)

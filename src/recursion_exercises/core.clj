(ns recursion-exercises.core
  (:require [clojure.string :as str]))

(defn full-tree
  ([size] (if (zero? size)
            []
            (let [size (dec size)] [(full-tree size) (full-tree size)]))))

(defn factorial [n]
  (if (= 1 n) 1 (* n (factorial (dec n)))))

(defn gcd [a b]
  (cond (= 0 a) b
        (= 0 b) a
        :else (gcd b (mod a b))))

(defn range
  ([n] (range 0 n 0 '()))
  ([n m] (range n m n '()))
  ([n m i lst] (if (= i m)
                 lst
                 (conj (range n m (inc i) lst) i))))

(defn match
  ([^String needle ^String haystack]
   (do (println (str "Matching '" needle "' to '" haystack "'"))
       (cond (nil? needle) nil
             (nil? haystack) nil
             :else (let [result (match (re-seq #".\??" needle) (re-seq #"." haystack) [])]
                     (if (nil? result)
                       nil
                       (str/join result))))))
  ([[first-needle & rest-needle] [first-haystack & rest-haystack] result]
   (do (println (str "=>> Matching '" first-needle "' to '" first-haystack "'"))
       (if (and first-needle first-haystack)
         (if (= (get first-needle 0) (get first-haystack 0))
           (match rest-needle rest-haystack (conj result first-haystack))
           (if (= \? (get first-needle 1))
             (match rest-needle (conj rest-haystack first-haystack) (d result))))
         (if first-needle
           (if (= \? (get first-needle 1))
             result
             nil)
           (if (not first-haystack)
             result))))))

(ns recursion-exercises.core)

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


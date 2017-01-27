(ns recursion-exercises.core)

(defn full-tree
  ([size] (if (zero? size)
            []
            (let [size (dec size)] [(full-tree size) (full-tree size)]))))


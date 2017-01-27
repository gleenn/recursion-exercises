(ns recursion-exercises.core-test
  (:require [midje.sweet :refer :all]
            [recursion-exercises.core :refer :all]))

(facts full-tree
       (fact "(full-tree N) returns tree of depth N"
             (full-tree 0) => []
             (full-tree 1) => [[] []]
             (full-tree 2) => [[[] []] [[] []]]))

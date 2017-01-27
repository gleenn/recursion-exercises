(ns recursion-exercises.core-test
  (:require [midje.sweet :refer :all]
            [recursion-exercises.core :refer :all]))

(facts full-tree
       (fact "(full-tree N) returns tree of depth N"
             (full-tree 0) => []
             (full-tree 1) => [[] []]
             (full-tree 2) => [[[] []] [[] []]]))

(facts factorial
       (fact "(factorial n) returns n!"
             (factorial 1) => 1
             (factorial 2) => 2
             (factorial 3) => 6
             (factorial 4) => 24
             (factorial 5) => 120
             (factorial 6) => 720))

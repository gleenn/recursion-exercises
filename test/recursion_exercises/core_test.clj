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

(facts gcd
       (fact "returns the greatest common divisor"
             (gcd 5 1) => 1
             (gcd 5 3) => 1
             (gcd 5 25) => 5
             (gcd 25 5) => 5
             (gcd 10 100) => 10
             (gcd 10 101) => 1))

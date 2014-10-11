; These are the solution to each problem posted on 4clojure.com
; @author : pradeepbishnoi

(ns clojure-solved.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println ""))

; 1
; Nothing but the Truth
; Enter a value which will make the form evaluate to true
; (= __ true)
(println 1 (= true true))

; 2
; Simple Math
; (= (- 10 (* 2 3)) __)
(println 2 (= (- 10 (* 2 3)) 4))

; 3
; Intro to Strings
; (= __ (.toUpperCase "hello world"))
(println 3 (= "HELLO WORLD" (.toUpperCase "hello world")))

; 4
; Intro to List
; (= (list __) '(:a :b :c))
(println 4 (= (list :a :b :c) '(:a :b :c)))

; 5
; Lists: conj
; (= __ (conj '(2 3 4) 1))
; (= __ (conj '(3 4) 2 1))
(println 5 (= `(1 2 3 4) (conj '(2 3 4) 1))) 

; 6
; Intro to Vectors
; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
(println 6 (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))

; 7 
; Vectors : conj
; (= __ (conj [1 2 3] 4))
; (= __ (conj [1 2] 3 4))
(println 7 (= [1 2 3 4] (conj [1 2] 3 4)))

; 8
; Intro to Sets
; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
(println 8 (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d))))

; 9
; Sets : conj
; (= #{1 2 3 4} (conj #{1 4 3} __))
(println 9 (= #{1 2 3 4} (conj #{1 4 3} 2)))

; 10
; Intro to Maps
; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
; (= __ (:b {:a 10, :b 20, :c 30}))
(println 10 (= 20 (:b {:a 10, :b 20, :c 30})))

; 11
; Maps : conj
; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
(println 11(= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3])))

; 12
; Intro to sequences
; (= __ (first '(3 2 1)))
; (= __ (second [2 3 4]))
; (= __ (last (list 1 2 3)))
(println 12 (= 3 (first '(3 2 1))))

; 13
; Sequences : rest
; (= __ (rest [10 20 30 40]))
(println 13 (= `(20 30 40) (rest [10 20 30 40])))

; 14
; Intro : Functions
; (= __ ((fn add-five [x] (+ x 5)) 3))
; (= __ ((fn [x] (+ x 5)) 3))
; (= __ (#(+ % 5) 3))
; (= __ ((partial + 5) 3))
(println 14 (= 8 ((fn add-five [x] (+ x 5)) 3)))

; 15
; Double Down
; (= (__ 2) 4)
; (= (__ 3) 6)
; (= (__ 11) 22)
; (= (__ 7) 14)
(println 15 (= (* 2 7) 14)) 
(println 15 (= (#(* % 2) 7) 14))

; 16
; Hello World
; (= (__ "Jenn") "Hello, Jenn!")
; (= (__ "Rhea") "Hello, Rhea!")
(println 16(= (#(str "Hello, " %1 \!) "Rhea") "Hello, Rhea!"))

; 17
; Sequences : Map
; The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure.
; (= __ (map #(+ % 5) '(1 2 3)))
(println 17 (= `(6 7 8) (map #(+ % 5) '(1 2 3))))

; 18
; Sequences: filter
; The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true.
; (= __ (filter #(> % 5) '(3 4 5 6 7)))
(println 18 (= `(6 7) (filter #(> % 5) '(3 4 5 6 7))))

; 19
; Last Element
; Write a function which returns the last element in a sequence (without using inbuilt LAST func).
; (= (__ [1 2 3 4 5]) 5)
; (= (__ '(5 4 3)) 3)
; (= (__ ["b" "c" "d"]) "d")
(println 19 (= (#(first (reverse %)) [1 2 3 4 5]) 5))

; 20
; Penultimate Element
; Write a function which returns the second to last element from a sequence.
; (= (__ (list 1 2 3 4 5)) 4)
; (= (__ ["a" "b" "c"]) "b")
; (= (__ [[1 2] [3 4]]) [1 2])
(println 20 (= (#(second (reverse %)) [[1 2] [3 4]]) [1 2]))

; 21
; Nth element
;
; (= (__ '(4 5 6 7) 2) 6)
; (= (__ [:a :b :c] 0) :a)
; (= (__ [1 2 3 4] 1) 2)
; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
(println 21 (= (#(get (vec %1) %2) [:a :b :c] 0) :a))
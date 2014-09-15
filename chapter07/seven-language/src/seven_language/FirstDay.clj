(ns seven-language.core)

(- 1)

(+ 1 1)

(* 10 10)

(/ 1 3)

(/ 2 4)

(/ 2.0 4)

(class (/ 1 3))

(mod 5 4)

(/ (/ 12 2) (/ 6 2))

(+ 2 2 2 2)

(- 8 1 2)

(/ 8 2 2)

(< 1 2 3)

(< 1 3 2 4)

(+ 3.0 5)

(+ 3 5.0)

(println "master yoda\nluke skywalker\ndarth vader")

(str 1)

(str "yoda, " "luke, " "darth")

(str "one: " 1 " two: " 2)

(str \f \o \r \c \e)

(= "a" \a)

(= (str \a) "a")

; ★書籍と異なる
(= 1 1.0)

(= 1 2)

(< 1 2)

(class true)

(class (= 1 1))

(if true (println "True it is."))

(if (> 1 2) (println "True it is."))

(if (< 1 2)
  (println "False it is not."))

(if false (println "true") (println "false"))

(first ())

(if 0 (println "true"))

(if nil (println "true"))

(if "" (println "true"))

(list 1 2 3)

'(1 2 3)

(first '(:r2d2 :c3po))

(last '(:r2d2 :c3po))

(rest '(:r2d2 :c3po))

(cons :battle-droid '(:r2d2 :c3po))

[:hutt :wookie :ewok]

(first [:hutt :wookie :ewok])

(nth [:hutt :wookie :ewok] 2)

(nth [:hutt :wookie :ewok] 0)

(last [:hutt :wookie :ewok])

([:hutt :wookie :ewok] 2)

(concat [:darth-vader] [:darth-maul])

(first [:hutt :wookie :ewok])

(rest [:hutt :wookie :ewok])

(def spacecraft #{:x-wing :y-wing :tie-fighter})

spacecraft

(count spacecraft)

(sort spacecraft)

(sorted-set 2 3 1)

(clojure.set/union #{:skywalker} #{:vander})

(clojure.set/difference #{1 2 3} #{2})

(#{:jar-jar :chewbacca} :chewbacca)

(#{:jar-jar :chewbacca} :luke)

{:chewiw :wookie :lea :human}

;{:jabba :hut :han }

{:darth-vader "obi wan", :luke "yoda"}

(def mentors {:darth-vader "obi wan", :luke "yoda"})

mentors

(mentors :luke)

(:luke mentors)

(merge {:y-wing 2, :x-wing 4} {:tie-righter 2})

(merge-with + {:y-wing 2, :x-wing 4} {:tie-fighter 2 :x-wing 3})

(assoc {:one 1} :two 2)

(sorted-map 1 :one, 3 :three, 2 :two)

;(defn force-it [] (str "Use the force," "Luke."))

(force-it)

(defn force-it
  "The first function a young Jedi needs"
  []
  (str "Use the force," "Luke."))

;★docはInstareplでは使えない？
;(doc force-it)

;(doc str)

(def line [[0 0] [10 20]])

line

(defn line-end [ln] (last ln))

(line-end line)

(defn line-end [[_ second]] second)

(line-end line)

(def board [[:x :o :x] [:o :x :o] [:o :x :o]])

;(defn center [[_ [_ c _] _]] c)
;(defn center [[_ [_ c]]] c)
(defn center [board]
  (let [[_ [_ c]] board] c))

(center board)

(def person {:name "Jabba" :profession "Gangster"})

(let [{name :name} person] (str "The person's name is " name))

(def villains [{:name "Godzilla" :size "big"} {:name "Ebola" :size "small"}])

(let [[_ {name :name}] villains] (str "Name of the second villain: " name))

; 無名関数
(def people ["Lea", "Han Solo"])

(count "Lea")

(map count people)

(defn twice-count [w] (* 2 (count w)))

(twice-count "Lando")

(map twice-count people)

(map (fn [w] (* 2 (count w))) people)

(map #(* 2 (count %)) people)

(def v [3 1 2])

(apply + v)

(apply max v)

(filter odd? v)

(filter #(< % 3) v)

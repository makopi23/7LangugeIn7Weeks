(defprotocol Compass
  (direction [c])
  (left [c])
  (right [c]))

(def directions [:north :east :suoth :west])

(defn turn
  [base amount]
  (rem (+ base amount) (count directions)))

(turn 1 1)

(turn 3 1)

(turn 2 3)

(defrecord SimpleCompass [bearing]
  Compass
  (direction [_] (directions bearing))
  (left [_] (SimpleCompass. (turn bearing 3)))
  (right [_] (SimpleCompass. (turn bearing 1)))
  Object
  (toString [this] (str "[" (direction this) "]")))

(def c (SimpleCompass. 0))

(left c)

c

(:bearing c)

; Broken unless
(defn unless [test body] (if (not test) body))

(unless true (println "Danger, danger will Robinson"))

(unless false (println "Danger, danger will Robinson"))

(macroexpand ''something-we-do-not-want-interpreted)

(macroexpand '#(count %))

(defmacro unless [test body]
  (list 'if (list 'not test) body))

(macroexpand '(unless condition body))

(unless true (println "No more danger, Will."))

(unless false (println "Now, THIS is The FORCE."))

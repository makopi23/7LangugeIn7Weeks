(defn size [v]
  (if (empty? v)
       0
       (inc (size (rest v)))))

(size [1 2 3])

;(loop [x x-initial-value, y y-initial-value] (do-something-with x y))
(loop [x 1] x)

(defn size [v]
  (loop [l v, c 0]
    (if (empty? l)
      c
      (recur (rest l) (inc c)))))

(size [1 2 3])

[1 2 3]

(rest [1 2 3])

(every? number? [1 2 3 :four])

(every? number? [1 2 3 4])

(some nil? [1 2 nil])

(not-every? odd? [1 3 5])

(not-any? number? [:one :two :three])

(def words ["luke" "chewie" "han" "lando"])

(filter (fn [word] (> (count word) 4)) words)

(map (fn [x] (* x x)) [1 1 2 3 5])

(def colors ["red" "blue"])

(def toys ["block" "car"])

(for [x colors] (str "I like " x))

(for [x colors, y toys] (str "I like " x " " y "s"))

(defn small-word? [w] (< (count w) 4))

(for [x colors, y toys, :when (small-word? y)]
  (str "I like " x "" y "s"))

(reduce + [1 2 3 4])

(reduce * [1 2 3 4 5])

(sort [3 1 2 4])

(defn abs [x] (if (< x 0) (- x) x))

(sort-by abs [-1 -4 3 2])

(range 1 10)

(range 1 10 3)

(range 10)

(take 3 (repeat "Use the Force, Luke"))

(take 5 (cycle [:lather :rinse :repeat]))

(take 5 (drop 2 (cycle [:lather :rinse :repeat])))

(->> [:lather :rinse :repeat] (cycle) (drop 2) (take 5))

(take 5 (interpose :and (cycle [:lather :rinse :repeat])))

(take 20 (interleave (cycle (range 2)) (cycle (range 3))))

(take 5 (iterate inc 1))

(take 5 (iterate dec 0))

(defn fib-pair [[a b]] [b (+ a b)])

(fib-pair [3 5])

(take 5
      (map
       first
       (iterate fib-pair [1 1])))

(nth (map first (iterate fib-pair [1 1])) 50)

(defn factorial [n] (apply * (take n (iterate inc 1))))

(factorial 5)

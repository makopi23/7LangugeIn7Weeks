(ref "Attack of the Clones")

(def movie (ref "Star Wars"))

movie

(deref movie)

@movie

(alter movie str ": The Empire Strikes Back")

(dosync (alter movie str ": The Empire Strikes Back"))

(dosync (ref-set movie "Star Wars: The Revenge of the Sith"))

@movie

(atom "Split at your own risk")

(def danger (atom "Split at your own risk."))

danger

@danger

(reset! danger "Split with impunity")

danger

@danger

(def top-sellers (atom []))

(swap! top-sellers conj {:title "Seven Languages", :author "Tate"})

(swap! top-sellers conj {:title "Programaming Clojure" :author "Halloway"})

; エージェント
(defn twice [x] (* 2 x))

(def tribbles (agent 1))

(send tribbles twice)

@tribbles

(defn slow-twice [x]
  (do
    (Thread/sleep 10000)
    (* 2 x)))

(send tribbles slow-twice)

@tribbles

@tribbles

(def finer-things (future (Thread/sleep 10000) "take time"))

@finer-things

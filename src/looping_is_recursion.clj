(ns looping-is-recursion)

(defn power [base exp]
      (cond
        (zero? base)
          0
        (= exp 0)
          1
        :else
          (let [helper (fn [acc n]
                       (if (= n 1)
                         acc
                         (recur (* acc base) (dec n))))]
           (helper base exp))))

(defn last-element [a-seq]
      (let [helper (fn [acc the-seq]
                       (if (empty? the-seq)
                         acc
                         (recur (first the-seq) (rest the-seq))))]
           (helper (first a-seq) (rest a-seq))))

(defn seq= [seq1 seq2]
      (let [helper (fn [acc new-seq1 new-seq2]
                       (cond
                         (and (empty? new-seq1) (empty? new-seq2))
                          acc
                         (or (empty? new-seq1) (empty? new-seq2))
                          false
                         :else
                          (recur (= (first new-seq1) (first new-seq2)) (rest new-seq1) (rest new-seq2))))]
           (helper true seq1 seq2)))

(defn find-first-index [pred a-seq]
      (loop [index 0
             the-pred pred
             the-seq a-seq
             ]
            (cond
              (empty? the-seq)
                nil
              (the-pred (first the-seq))
                index
              :else
                (recur (inc index) the-pred (rest the-seq)))))

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])


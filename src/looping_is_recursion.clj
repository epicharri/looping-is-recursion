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
  ":(")

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])


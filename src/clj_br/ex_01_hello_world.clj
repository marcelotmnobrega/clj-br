(ns clj-br.ex-01-hello-world)

;; Meetup Clojure BR - 02
;; https://www.youtube.com/watch?v=czIJvqMQKfQ

(defn hello
  ([] (hello "World"))
  ([fullname] (str "Hello, " fullname "!"))
  ([firstname lastname] (hello  (str firstname " " lastname))))


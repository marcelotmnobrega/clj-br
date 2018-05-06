(ns clj-br.ex-01-hello-world-test
  (:require [clojure.test :refer :all]
            clj-br.ex-01-hello-world))

(deftest ex-01-hello-world-test-01
  (is (= "Hello, World!" (clj-br.ex-01-hello-world/hello))))

(deftest ex-01-hello-world-test-02
  (is (= "Hello, Marcelo Nobrega!" (clj-br.ex-01-hello-world/hello "Marcelo" "Nobrega"))))

(deftest ex-01-hello-world-test-03
  (is (= "Hello, Pena!" (clj-br.ex-01-hello-world/hello "Pena"))))

package com.pluralsight.GenericMiniExercises;
public interface Result<T,E> {
    //interface factory methods to return Ok or Error objects
    class Results {
        static <T,E> Result<T,E> ok(T value) {
            return new Ok<>(value);
        }
        static <T,E> Result<T,E> err(E error) {
            return new Err<>(error);
        }
    }
    //inner classes (within Result interface) to define Ok and Error classes
    class Ok<T,E> implements Result<T,E> {
        private T value;
        public Ok(T value) {
            this.value = value;
        }
        public T getValue() {
            return value;
        }
        @Override
        public String toString() {
            return "Ok(" + value + ")";
        }
    }
    class Err<T,E> implements Result<T,E> {
        private E error;
        public Err(E error) {
            this.error = error;
        }
        public E getError() {
            return error;
        }
        @Override
        public String toString() {
            return "Error(" + error + ")";
        }
    }
}

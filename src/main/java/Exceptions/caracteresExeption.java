package Exceptions;

public class caracteresExeption extends RuntimeException {
        private String mensagem;
    public caracteresExeption (String mensagem) {
            this.mensagem = mensagem;
        }
        @Override
        public String getMessage() {
            return this.mensagem;
        }
    }


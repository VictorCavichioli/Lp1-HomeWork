public class Estagiario {

        String nome;
        String RA;


        public String getNome() {
            return nome;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }


        public String getRA() {
            return RA;
        }


        public void setRA(String rA) {
            RA = rA;
        }


        public Estagiario(String nome, String rA) {
            super();
            this.nome = nome;
            RA = rA;
        }


        @Override
        public String toString() {
            return nome + ", RA=" + RA;
        }



    }


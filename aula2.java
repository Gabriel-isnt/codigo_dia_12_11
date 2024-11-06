public class aula2{
    public static void main(String[] args){

        Livro livro1 = new Livro("xangalanga", "Gabriel", "1h23");

        System.out.println(livro1.getAutor());
        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getIsbn());

        livro1.devolverlivro();
        livro1.emprestarLivro();
        livro1.devolverlivro();

    }
}



class Livro{

    private String titulo;
    private String autor;
    private String isbn;  // id para livro
    private boolean disponivel = true;

    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }


    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean isDisponivel(){
        return disponivel;
    }


    public void emprestarLivro(){

        if(!(this.disponivel)){
            System.out.println("livro já emprestado :()");
            return;
        }

        this.disponivel = false;
        System.out.println("emprestimo feito :)");         
    }


    public void devolverlivro(){

        if(!(this.disponivel)){
            this.disponivel = true;
            System.out.println("devolvido :)");
            return;   
        }

        System.out.println("esse livro já tá disponivel :)");

    }
}



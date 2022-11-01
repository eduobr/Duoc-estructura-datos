package Datos;

public class EjercicioAnimales {

    Arbol arbolBinario;
    NodoArbol nodo;
    int acumS = 0;
    int acumN = 0;
    int acumE = 0;
    int acumOe = 0;
    int acumS1 = 0;
    int acumN1 = 0;
    int acumE1 = 0;
    int acumOe1 = 0;
    int contS1 = 0;
    int contN1 = 0;
    int contE1 = 0;
    int contOe1 = 0;
    int acumMacho=0;
    int acumHembra=0;

    public EjercicioAnimales(NodoArbol arbol) {
        arbolBinario = new Arbol(arbol);
    }

    public void CuantosAnimalesPorSeccion(NodoArbol raiz) {
        if (raiz != null) {
            TipoAnimal tipoAni = (TipoAnimal) raiz.getDato();
            if (tipoAni.getSeccion().equals("sur")) {
                acumS++;
            }
            if (tipoAni.getSeccion().equals("norte")) {
                acumN++;
            }
            if (tipoAni.getSeccion().equals("este")) {
                acumE++;
            }
            if (tipoAni.getSeccion().equals("oeste")) {
                acumOe++;
            }

            CuantosAnimalesPorSeccion(raiz.getIzq());
            CuantosAnimalesPorSeccion(raiz.getDer());

        }

    }

    public void mostrarCuantosAnimalesPorSeccion() {

        System.out.println("sur:" + acumS);
        System.out.println("norte:" + acumN);
        System.out.println("este:" + acumE);
        System.out.println("oeste:" + acumOe);
    }
    
    
      public void cantidadAnimalesPorSexo(NodoArbol raiz) {
        if (raiz != null) {
            TipoAnimal tipoAni = (TipoAnimal) raiz.getDato();
            if (tipoAni.getAnimales().getSexo()=='M') {
                acumMacho++;
            }
            if (tipoAni.getAnimales().getSexo()=='F') {
                acumHembra++;
            }
           

            cantidadAnimalesPorSexo(raiz.getIzq());
            cantidadAnimalesPorSexo(raiz.getDer());

        }

    }
      
      public void mostrarCantidadAnimalesPorSexo() {

        System.out.println("Machos:" + acumMacho);
        System.out.println("Hembras:" + acumHembra);
        
    }
      
      public void promedioPorSeccion(NodoArbol raiz) {
        if (raiz != null) {
            TipoAnimal tipoAni = (TipoAnimal) raiz.getDato();
            if (tipoAni.getSeccion().equals("sur")) {
                contS1++;
                acumS1+=tipoAni.getAnimales().getEdad();
            }
            if (tipoAni.getSeccion().equals("norte")) {
                contN1++;
                acumN1+=tipoAni.getAnimales().getEdad();
            }
            if (tipoAni.getSeccion().equals("este")) {
                contE1++;
                acumE1+=tipoAni.getAnimales().getEdad();
            }
            if (tipoAni.getSeccion().equals("oeste")) {
                contOe1++;
                acumOe1+=tipoAni.getAnimales().getEdad();
            }

            promedioPorSeccion(raiz.getIzq());
            promedioPorSeccion(raiz.getDer());

        }

    }   
      
      
        public void mostrarPromedioPorSeccion() {

        System.out.println("sur:" + acumS1/contS1+" años");
        System.out.println("norte:" + acumN1/contN1+" años");
        System.out.println("este:" + acumE1/contE1+" años");
        System.out.println("oeste:" + acumOe1/contOe1+" años");
    }
      
      
      
      
}

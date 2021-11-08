package testGerrit;

public class TestGerrit {
	   static void main(String[ ] args)
	   { // recherche séquentielle dans un tableau
			 int [ ] table= {12,-5,7,8,-6,6,4,78,2};
			 int elt = 4, i ;
			 for ( i = 0 ; i<8 ; i++ )
			   if (elt==table[i]) break ;
			 if (i == 8) System.out.println("valeur : "+elt+" pas trouvée.");
			 else System.out.println("valeur : "+elt+" trouvée au rang :"+i);
	   }
}

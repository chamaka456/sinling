 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 p u b l i c   c l a s s   H B T r a n s f o r m   {  
  
 	 p r i v a t e   H B W o r d   o _ L e m m a   =   n u l l ;  
 	 p r i v a t e   H B W o r d   o _ F o r m   =   n u l l ;  
 	 p r i v a t e   H B T r a n s f o r m R u l e   o _ R u l e   =   n u l l ;  
 	  
 	 p u b l i c   H B T r a n s f o r m ( )   {  
 	 	 o _ L e m m a   =   n u l l ;  
 	 	 o _ R u l e   =   n u l l ;  
 	 	 o _ F o r m   =   n u l l ;    
 	 }  
  
 	 p u b l i c   H B T r a n s f o r m ( H B W o r d   o L e m m a ,   H B T r a n s f o r m R u l e   o R u l e ,   H B W o r d   o F o r m )   {  
 	 	 o _ L e m m a   =   o L e m m a ;  
 	 	 o _ R u l e   =   o R u l e ;  
 	 	 o _ F o r m   =   o F o r m ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t L e m m a ( )  
 	 {  
 	 	 r e t u r n   o _ L e m m a ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e   G e t R u l e ( )  
 	 {  
 	 	 r e t u r n   o _ R u l e ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t F o r m ( )  
 	 {  
 	 	 r e t u r n   o _ F o r m ;  
 	 }  
 	  
 }  

 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t o o l s . c r a w l e r ;  
  
 p u b l i c   c l a s s   H B T e x t I t e m   {  
  
 	 p r i v a t e   S t r i n g   	 s _ V a l u e   =   n u l l ;  
 	 p r i v a t e   s h o r t 	 i _ T y p e   =   0 ;  
 	 p r i v a t e   l o n g 	 l _ C o u n t   =   0 ;  
 	  
 	 p u b l i c   H B T e x t I t e m ( S t r i n g   s V a l u e ,   s h o r t   i T y p e )    
 	 {  
 	 	 s _ V a l u e   =   s V a l u e ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 l _ C o u n t   =   0 ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   G e t V a l u e ( )  
 	 {  
 	 	 r e t u r n   s _ V a l u e ;  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t T y p e ( )  
 	 {  
 	 	 r e t u r n   i _ T y p e ;  
 	 }  
 	  
 	 p u b l i c   l o n g   G e t C o u n t ( )  
 	 {  
 	 	 r e t u r n   l _ C o u n t ;  
 	 }  
  
 	 p u b l i c   v o i d   A d d O c c u r a n c e ( )  
 	 {  
 	 	 l _ C o u n t + + ;  
 	 }  
 	  
 }  

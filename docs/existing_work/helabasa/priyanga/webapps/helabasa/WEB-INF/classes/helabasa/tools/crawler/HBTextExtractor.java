 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t o o l s . c r a w l e r ;  
  
 i m p o r t   h e l a b a s a . t o o l s . c r a w l e r . e x t r a c t o r s . H B S i l u m i n a E x t r a c t o r ;  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . p a r s e r . H t m l P a r s e D a t a ;  
  
 p u b l i c   c l a s s   H B T e x t E x t r a c t o r   {  
  
 	 p u b l i c   H B T e x t E x t r a c t o r ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
 	  
 	 p u b l i c   S t r i n g   E x t r a c t ( H t m l P a r s e D a t a   h t m l P a r s e D a t a )  
 	 { 	 	  
 	 	 r e t u r n   h t m l P a r s e D a t a . g e t T e x t ( ) ;  
 	 }  
  
 	  
 	 p u b l i c   H B T e x t E x t r a c t o r   G e t E x t r a c t o r ( S t r i n g   s N a m e )  
 	 {  
 	 	 i f ( s N a m e . e q u a l s ( " s i l u m i n a " ) )  
 	 	 {  
 	 	 	 r e t u r n   n e w   H B S i l u m i n a E x t r a c t o r ( ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 r e t u r n   n e w   H B T e x t E x t r a c t o r ( ) ;  
 	 	 }  
 	 }  
 	  
 }  

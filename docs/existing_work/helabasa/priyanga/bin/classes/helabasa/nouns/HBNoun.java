 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . n o u n s ;  
  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B F o r m C o n t a i n e r ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B K n o w l e d g e B a s e ;  
 i m p o r t   h e l a b a s a . H B L e m m a ;  
 i m p o r t   h e l a b a s a . H B P O S ;  
 i m p o r t   h e l a b a s a . H B R e g u l a r B i G r a m F o r m ;  
 i m p o r t   h e l a b a s a . H B R e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . I t e r a t o r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B N o u n   e x t e n d s   H B P O S   {  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ P R   	 =   " P R " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ K R   	 =   " K R " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ K T   	 =   " K T " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ K A   	 =   " K A " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ S P   	 =   " S P " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ A V   	 =   " A V " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ S M   	 =   " S M " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ A D   	 =   " A D " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ A L   	 =   " A L " ;  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ P R _ S   	 =   "�� ���� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ K R _ S   	 =   "���� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ K T _ S   	 =   "����� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ K A _ S   	 =   "��� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ S P _ S   	 =   "����� ���� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ A V _ S   	 =   "���� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ S M _ S   	 =   "������� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ A D _ S   	 =   "���� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C O N J _ A L _ S   	 =   "���� " ; 	  
 	  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ P R   	 =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ K R   	 =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ K T   	 =   2 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ K A   	 =   3 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ S P   	 =   4 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ A V   	 =   5 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ S M   	 =   6 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ A D   	 =   7 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C O N J _ A L   	 =   8 ; 	  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C A T _ S I N G   	 	 =   " D S " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C A T _ I N D E F _ S I N G   	 =   " I S " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C A T _ P L U R A L   	 	 =   " P L " ;  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C A T _ S I N G _ S   	 	 =   "��  ��� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C A T _ I N D E F _ S I N G _ S 	 =   "�����  ��  ��� " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   H B S _ C A T _ P L U R A L _ S 	 	 =   "���  ��� " ; 	  
 	  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C A T _ S I N G   	 	 =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C A T _ I N D E F _ S I N G   	 =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B I _ C A T _ P L U R A L   	 	 =   2 ;  
 	  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g [ ]   a r r _ V i b h a k t h i   =   { H B S _ C O N J _ P R ,   H B S _ C O N J _ K R ,   H B S _ C O N J _ K T ,   H B S _ C O N J _ K A ,   H B S _ C O N J _ S P ,    
 	 	 H B S _ C O N J _ A V ,   H B S _ C O N J _ S M ,   H B S _ C O N J _ A D ,   H B S _ C O N J _ A L } ;  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g [ ]   a r r _ V i b h a k t h i _ s   =   { H B S _ C O N J _ P R _ S ,   H B S _ C O N J _ K R _ S ,   H B S _ C O N J _ K T _ S ,   H B S _ C O N J _ K A _ S ,   H B S _ C O N J _ S P _ S ,    
 	 	 H B S _ C O N J _ A V _ S ,   H B S _ C O N J _ S M _ S ,   H B S _ C O N J _ A D _ S ,   H B S _ C O N J _ A L _ S } ; 	  
 	  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g [ ]   a r r _ N o u n C a t e g o r i e s   =   { H B S _ C A T _ S I N G ,   H B S _ C A T _ I N D E F _ S I N G ,   H B S _ C A T _ P L U R A L } ;  
  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g [ ]   a r r _ N o u n C a t e g o r i e s _ s   =   { H B S _ C A T _ S I N G _ S ,   H B S _ C A T _ I N D E F _ S I N G _ S ,   H B S _ C A T _ P L U R A L _ S } ;  
 	  
 	 p r i v a t e   H B F o r m C o n t a i n e r   o _ F o r m s   =   n e w   H B F o r m C o n t a i n e r ( ) ;  
 	  
 	 p u b l i c   H B N o u n ( )   {  
 	 	 S e t T y p e ( H B P O S . P O S _ N O U N ) ;  
 	 }  
  
 	 p u b l i c   s t a t i c   s h o r t   E x t r a c t T y p e ( S t r i n g   s F o r m I D )  
 	 {  
 	 	 S t r i n g   s T y p e   =   s F o r m I D . s u b s t r i n g ( 0 ,   2 ) ;  
 	 	  
 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( s F o r m I D   +   "   :   T = "   +   s T y p e ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < 9 ;   i + + )  
 	 	 {  
 	 	 	 i f ( a r r _ V i b h a k t h i [ i ] . e q u a l s ( s T y p e ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   ( s h o r t ) i ;  
 	 	 	 }  
 	 	 } 	 	  
 	 	 r e t u r n   - 1 ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   s h o r t   E x t r a c t S u b T y p e ( S t r i n g   s F o r m I D )  
 	 {  
 	 	 S t r i n g   s S T y p e   =   s F o r m I D . s u b s t r i n g ( 3 ,   5 ) ;  
 	 	  
 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( s F o r m I D   +   "   :   S T = "   +   s S T y p e ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < 3 ;   i + + )  
 	 	 {  
 	 	 	 i f ( a r r _ N o u n C a t e g o r i e s [ i ] . e q u a l s ( s S T y p e ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   ( s h o r t ) i ;  
 	 	 	 }  
 	 	 } 	 	  
 	 	 r e t u r n   - 1 ;  
 	 } 	  
 	  
 	 p u b l i c   v o i d   S e t R u l e S e t ( H B T r a n s f o r m R u l e S e t   o R u l e S e t )  
 	 {  
 	 	 o _ R u l e S e t   =   o R u l e S e t ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t ( )  
 	 {  
 	 	 r e t u r n   o _ R u l e S e t ;  
 	 }  
 	  
 	 p u b l i c   l o n g   G e t L e m m a I D ( )  
 	 {  
 	 	 r e t u r n   H B K n o w l e d g e B a s e . G e t L e m m a I D ( t h i s . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( ) ,   H B L e m m a . L E M M A _ T Y P E _ N O U N ,   H B L e m m a . L E M M A _ S U B _ T Y P E _ D E F A U L T ) ; 	 	 	 	  
 	 }  
  
 	 p u b l i c   v o i d   G e n e r a t e F o r m s ( H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r i n g A l g o )  
 	 { 	 	  
 	 	 / / S t e p   1 .   F i l l   w i t h   u s e r   d e f i n e d   f o r m s  
 	 	 L i s t < H B I r r e g u l a r F o r m >   l s t I F   =   n e w   A r r a y L i s t < H B I r r e g u l a r F o r m > ( ) ;  
 	 	 l o n g   i L e m m a I D   =   H B K n o w l e d g e B a s e . G e t L e m m a I D ( t h i s . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( ) ,   H B L e m m a . L E M M A _ T Y P E _ N O U N ,   H B L e m m a . L E M M A _ S U B _ T Y P E _ D E F A U L T ) ;  
 	 	  
 	 	 H B K n o w l e d g e B a s e . G e t E x c e p t i o n s ( i L e m m a I D ,   l s t I F ) ;  
 	 	 	 	  
 	 	 i f ( l s t I F . s i z e ( ) > 0 )  
 	 	 {  
 	 	 	 f o r   ( I t e r a t o r < H B I r r e g u l a r F o r m >   i t e r   =   l s t I F . i t e r a t o r ( ) ;   i t e r . h a s N e x t ( ) ;   )    
 	 	 	 { 	 	 	 	  
 	 	 	 	 H B I r r e g u l a r F o r m   o F o r m   =   i t e r . n e x t ( ) ;  
 	 	 	 	 o _ F o r m s . A d d F o r m ( o F o r m . G e t T y p e ( ) ,   o F o r m . G e t S u b T y p e ( ) ,   o F o r m ) ;  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e F o r m s   :   E x c e p t i o n   :   L e m m a   :   "   +   t h i s . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( )   +   "   :   I D = "   +   i L e m m a I D   +    
 	 	 	 	 	 	 "   :   T = "   +   o F o r m . G e t T y p e ( )   +   "   :   S T = "   +   o F o r m . G e t S u b T y p e ( )   +   "   :   F o r m = "   +   o F o r m . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	 }  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e F o r m s   :   N o   E x c e p t i o n s   F o u n d   f o r   L e m m a   :   "   +   t h i s . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( )   +   "   :   I D = "   +   i L e m m a I D ) ; 	 	  
 	 	 }  
 	 	  
 	 	 / / S t e p   2 .   G e n e r a t e   t h e   r e m a i n i n g   p a r t   u s i n g   r u l e s 	 	 	 	  
 	 	 i n t   i C o u n t   =   o _ R u l e S e t . G e t R u l e C o u n t ( ) ; 	 	  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   o _ R u l e S e t . G e t R u l e ( i ) ;  
 	 	 	  
 	 	 	 i f ( o _ F o r m s . G e t F o r m s C o u n t ( o R u l e . G e t T y p e ( ) ,   o R u l e . G e t S u b T y p e ( ) ) = = 0 ) 	 	 	 	  
 	 	 	 { 	 	 	  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e F o r m s   :   R u l e I D = "   +   o R u l e . G e t R u l e S e t ( ) . G e t I D ( )   +   "   :   R u l e N a m e = "   +   o R u l e . G e t R u l e S e t ( ) . G e t N a m e ( ) ) ;  
 	  
 	 	 	 	 H B W o r d   o W o r d   =   o R u l e . G e n e r a t e B e s t F o r m ( o _ L e m m a ,   o J o i n S c o r i n g A l g o ) ; 	  
 	 	 	 	 i f ( o W o r d ! = n u l l )  
 	 	 	 	 { 	 	 	 	 	  
 	 	 	 	 	 H B R e g u l a r F o r m   o F o r m   =   n e w   H B R e g u l a r F o r m ( o R u l e ,   o W o r d ) ;  
 	 	 	 	 	 o _ F o r m s . A d d F o r m ( o R u l e . G e t T y p e ( ) ,   o R u l e . G e t S u b T y p e ( ) ,   o F o r m ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 }  
 	 	 } 	 	  
 	 	  
 	 	 S e t S c o r e ( o _ F o r m s . G e t S c o r e ( ) ) ;  
 	 }  
  
 	 p u b l i c   v o i d   G e n e r a t e D e r i v e d F o r m s ( H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r i n g A l g o ,   L i s t < H B T r a n s f o r m R u l e >   l i s t R u l e s )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t R u l e s . s i z e ( ) ; 	 	  
 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e D e r i v e d F o r m s   :   R u l e C o u n t = "   +   i C o u n t ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t R u l e s . g e t ( i ) ;  
 	 	 	  
 	 	 	 / / i f ( o _ F o r m s . G e t F o r m s C o u n t ( o R u l e . G e t T y p e ( ) ,   o R u l e . G e t S u b T y p e ( ) ) = = 0 ) 	 	 	 	  
 	 	 	 { 	 	 	  
 	 	 	 	 L i s t < H B F o r m >   l i s t K R F o r m s   =   o _ F o r m s . G e t F o r m s ( H B N o u n . H B I _ C O N J _ K R ,   o R u l e . G e t S u b T y p e ( ) ) ;  
 	 	 	 	  
 	 	 	 	 i f ( l i s t K R F o r m s ! = n u l l )  
 	 	 	 	 { 	 	 	 	  
 	 	 	 	 	 i n t   i K R C o u n t   =   l i s t K R F o r m s . s i z e ( ) ; 	 	  
 	 	 	 	 	  
 	 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e D e r i v e d F o r m s   :   T y p e = "   +   o R u l e . G e t T y p e ( )   +   "   :   S u b T y p e = "   +   o R u l e . G e t S u b T y p e ( )   +   "   :   S u f f i x = "   +   o R u l e . G e t S u f f i x ( ) . G e t N a t u r a l F o r m ( )   +   "   :   K R F o r m s = "   +   i K R C o u n t ) ;  
 	 	 	 	 	  
 	 	 	 	 	 f o r ( i n t   j = 0 ;   j < i K R C o u n t ;   j + + )  
 	 	 	 	 	 { 	 	 	 	 	 	  
 	 	 	 	 	 	 H B F o r m   o K R F o r m   =   l i s t K R F o r m s . g e t ( j ) ;  
 	 	 	 	 	 	 H B W o r d   o W o r d   =   o R u l e . G e n e r a t e B e s t F o r m ( o K R F o r m . G e t W o r d ( ) ,   o J o i n S c o r i n g A l g o ) ; 	  
 	 	 	 	 	 	 i f ( o W o r d ! = n u l l )  
 	 	 	 	 	 	 { 	  
 	 	 	 	 	 	 	 H B F o r m   o l d F o r m   =   o _ F o r m s . G e t F i r s t F o r m ( o R u l e . G e t T y p e ( ) ,   o R u l e . G e t S u b T y p e ( ) ) ;  
 	 	 	 	 	 	 	 l o n g   l F r e q   =   - 1 ;  
 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 i f ( o l d F o r m ! = n u l l )  
 	 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 	 l F r e q   =   o l d F o r m . G e t W o r d ( ) . G e t F r e q u e n c y ( ) ;  
 	 	 	 	 	 	 	 }  
 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 i f ( l F r e q   <   o W o r d . G e t F r e q u e n c y ( ) )  
 	 	 	 	 	 	 	 { 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	 H B R e g u l a r F o r m   o F o r m   =   n e w   H B R e g u l a r F o r m ( o R u l e ,   o W o r d ) ;  
 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	 i f ( o l d F o r m ! = n u l l )  
 	 	 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e D e r i v e d F o r m s   :   R e m o v e d   W o r d   :   "   +   o l d F o r m . G e t W o r d ( ) . G e t N a t u r a l F o r m ( )   +   "   :   O l d = "   +   l F r e q   +   "   <   N e w = "   +   o W o r d . G e t F r e q u e n c y ( ) ) ;  
 	 	 	 	 	 	 	 	 	 o _ F o r m s . R e m o v e F o r m ( o l d F o r m ) ;  
 	 	 	 	 	 	 	 	 } 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	  
 	 	 	 	 	 	 	 	 o _ F o r m s . A d d F o r m ( o R u l e . G e t T y p e ( ) ,   o R u l e . G e t S u b T y p e ( ) ,   o F o r m ) ;  
 	 	 	 	 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e D e r i v e d F o r m s   :   A d d e d   W o r d   :   "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   "   :   O l d = "   +   l F r e q   +   "   <   N e w = "   +   o W o r d . G e t F r e q u e n c y ( ) ) ;  
 	 	 	 	 	 	 	 }  
 	 	 	 	 	 	 	 e l s e  
 	 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e D e r i v e d F o r m s   :   I g n o r e d   W o r d   :   "   +   o W o r d . G e t N a t u r a l F o r m ( )     +   "   :   O l d = "   +   l F r e q   +   "   <   N e w = "   +   o W o r d . G e t F r e q u e n c y ( ) ) ;  
 	 	 	 	 	 	 	 }  
 	 	 	 	 	  
 	 	 	 	 	 	 }  
 	 	 	 	 	 	 e l s e  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e D e r i v e d F o r m s   :   N o   w o r d s   f o u n d " ) ;  
 	 	 	 	 	 	 }  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e D e r i v e d F o r m s   :   N o   K R   f o r m   f o r   S u b T y p e = "   +   o R u l e . G e t S u b T y p e ( ) ) ;  
 	 	 	 	 }  
 	 	 	 } 	 	 	  
 	 	 } 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   G e n e r a t e F i x e d D e r i v e d F o r m s ( L i s t < H B T r a n s f o r m R u l e >   l i s t R u l e s )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t R u l e s . s i z e ( ) ; 	 	  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t R u l e s . g e t ( i ) ;  
 	 	  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e F i x e d D e r i v e d F o r m s   :   T y p e = "   +   o R u l e . G e t T y p e ( )   +   "   :   S u b T y p e = "   +   o R u l e . G e t S u b T y p e ( )   +   "   :   S u f f i x = "   +   o R u l e . G e t S u f f i x ( ) . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	  
 	 	 	 L i s t < H B F o r m >   l i s t K R F o r m s   =   o _ F o r m s . G e t F o r m s ( H B N o u n . H B I _ C O N J _ K R ,   o R u l e . G e t S u b T y p e ( ) ) ;  
 	 	 	  
 	 	 	 i f ( l i s t K R F o r m s ! = n u l l )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 i n t   i K R C o u n t   =   l i s t K R F o r m s . s i z e ( ) ; 	 	  
 	 	 	 	  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e F i x e d D e r i v e d F o r m s   :   K R F o r m s = "   +   i K R C o u n t ) ;  
 	 	 	 	  
 	 	 	 	 f o r ( i n t   j = 0 ;   j < i K R C o u n t ;   j + + )  
 	 	 	 	 { 	 	 	 	 	 	  
 	 	 	 	 	 H B F o r m   o K R F o r m   =   l i s t K R F o r m s . g e t ( j ) ;  
 	 	 	 	 	 	 	 	  
 	 	 	 	 	 H B W o r d   o D e r i v e d W o r d   =   o K R F o r m . G e t W o r d ( ) . C l o n e ( ) ;  
 	 	 	 	 	  
 	 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e F i x e d D e r i v e d F o r m s   :   M e r g i n g   [ "   +   o D e r i v e d W o r d . G e t N a t u r a l F o r m ( )   +   " ]   +   [ "   +   o R u l e . G e t S u f f i x ( ) . G e t N a t u r a l F o r m ( )   +   " ] " ) ;  
 	 	 	 	 	  
 	 	 	 	 	 / / o D e r i v e d W o r d . A p p e n d ( o R u l e . G e t S u f f i x ( ) ) ;  
 	 	 	 	 	 H B R e g u l a r B i G r a m F o r m   o F o r m   =   n e w   H B R e g u l a r B i G r a m F o r m ( o R u l e ,   o D e r i v e d W o r d ) ;  
 	 	 	 	 	  
 	 	 	 	 	 o _ F o r m s . A d d F o r m ( o R u l e . G e t T y p e ( ) ,   o R u l e . G e t S u b T y p e ( ) ,   o F o r m ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e n e r a t e F i x e d D e r i v e d F o r m s   :   N o   K R   f o r m   f o r   S u b T y p e = "   +   o R u l e . G e t S u b T y p e ( ) ) ;  
 	 	 	 } 	 	 	  
 	 	 } 	 	  
 	 }  
 	  
 	 p u b l i c   L i s t < H B F o r m >   I d e n t i f y ( S t r i n g   s F o r m )  
 	 {  
 	 	 r e t u r n   o _ F o r m s . I d e n t i f y ( n e w   H B W o r d ( s F o r m ) ) ; 	 	  
 	 }  
 	 	  
 	 p u b l i c   L i s t < H B F o r m >   G e t N o u n F o r m s ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 {  
 	 	 r e t u r n   o _ F o r m s . G e t F o r m s ( i T y p e ,   i S u b T y p e ) ; 	 	  
 	 } 	  
 	  
 	 p u b l i c   L i s t < S t r i n g >   G e t N o u n F o r m S t r i n g s ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 {  
 	 	 L i s t < H B F o r m >   l i s t F o r m s   =   o _ F o r m s . G e t F o r m s ( i T y p e ,   i S u b T y p e ) ;  
 	 	 i f ( l i s t F o r m s ! = n u l l )  
 	 	 {  
 	 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ; 	 	  
 	 	 	 L i s t < S t r i n g >   l i s t W o r d s   =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s . g e t ( i ) ; 	 	 	 	  
 	 	 	 	 l i s t W o r d s . a d d ( o F o r m . G e t N a t u r a l F o r m ( ) ) ; 	 	 	  
 	 	 	 } 	 	 	 	  
 	 	 	 r e t u r n   l i s t W o r d s ;  
 	 	 }  
 	 	 e l s e  
 	 	 	 r e t u r n   n u l l ;  
 	 } 	  
 	  
 	 p r i v a t e   S t r i n g [ ]   G e t D i r e c t N o u n F o r m s ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 { 	  
 	 	 L i s t < H B F o r m >   l i s t F o r m s   =   o _ F o r m s . G e t F o r m s ( i T y p e ,   i S u b T y p e ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ;  
 	 	 i f ( i C o u n t > 0 )  
 	 	 {  
 	 	 	 S t r i n g [ ]   a r r W o r d s   =   n e w   S t r i n g [ i C o u n t ] ;  
 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s . g e t ( i ) ;  
 	 	 	 	  
 	 	 	 	 a r r W o r d s [ i ]   =   o F o r m . G e t N a t u r a l F o r m ( ) ; 	 	 	  
 	 	 	 }  
 	 	 	 	  
 	 	 	 r e t u r n   a r r W o r d s ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   S t r i n g [ ]   G e t D e r i v e d N o u n F o r m s ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 {  
 	 	 s w i t c h ( i T y p e )  
 	 	 {  
 	 	 	 c a s e     H B I _ C O N J _ K T :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R   +  ������  
 	 	 	 	 S t r i n g [ ]   a r r W o r d s   =   G e t D i r e c t N o u n F o r m s ( H B I _ C O N J _ K R ,   i S u b T y p e ) ;  
 	 	 	 	 f o r ( i n t   i = 0 ;   i < a r r W o r d s . l e n g t h ;   i + + )  
 	 	 	 	 {  
 	 	 	 	 	 / / a r r W o r d s [ i ] . A p p e n d ( )  
 	 	 	 	 }  
 	 	 	 	  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ K A :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +������  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ S P :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +   (��   ,  � )  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ A V :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +   (������ ,  ���� ,  ������ ) 	 	 	 	  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ S M :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +  ��  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
 	 	 	 c a s e     H B I _ C O N J _ A D :  
 	 	 	 {  
 	 	 	 	 / / H B I _ C O N J _ K R +  ������  
 	 	 	 	 / / H B I _ C O N J _ K R +  ���  
 	 	 	 	 b r e a k ;  
 	 	 	 } 	 	  
 	 	 	 d e f a u l t :  
 	 	 	 {  
 	 	 	 	  
 	 	 	 }  
 	 	  
 	 	 } 	  
 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
  
 	  
 	 p u b l i c   b o o l e a n   F i n d F o r m ( H B W o r d   o W o r d )  
 	 { 	 	  
 	 	 L i s t < H B W o r d >   l i s t F o r m s   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 G e t A l l N o u n F o r m s ( l i s t F o r m s ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ; 	 	  
  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B W o r d   o W d   =   l i s t F o r m s . g e t ( i ) ;  
 	 	 	 i f ( o W d . E q u a l s ( o W o r d ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   f a l s e ;  
 	 } 	  
 	  
 	 p u b l i c   v o i d   G e t A l l N o u n F o r m s ( L i s t < H B W o r d >   l i s t F o r m s )  
 	 {  
 	 	 L i s t < H B F o r m >   l i s t N o u n F o r m s   =   o _ F o r m s . G e t A l l F o r m s ( ) ;  
  
 	 	 i n t   i C o u n t   =   l i s t N o u n F o r m s . s i z e ( ) ; 	 	  
  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 { 	  
 	 	 	 l i s t F o r m s . a d d ( l i s t N o u n F o r m s . g e t ( i ) . G e t W o r d ( ) ) ; 	 	 	 	 	  
 	 	 } 	 	 	  
 	 } 	  
 	  
 	 p r i v a t e   v o i d   D e b u g P r i n t F o r m ( S t r i n g   s T y p e ,   S t r i n g   s S u b T y p e ,   L i s t < H B F o r m >   l i s t F o r m s )  
 	 {  
 	 	 S t r i n g   s E x e c p t i o n M a r k   =   " " ;  
 	 	  
 	 	 i f ( l i s t F o r m s ! = n u l l )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( s T y p e   +   " - "   +   s S u b T y p e   +   "   =   " ) ;  
 	 	 	 f o r ( i n t   i = 0 ;   i < l i s t F o r m s . s i z e ( ) ;   i + + )  
 	 	 	 {  
 	 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s . g e t ( i ) ;  
 	 	 	 	  
 	 	 	 	 i f ( o F o r m . G e t F o r m T y p e ( )   = =   H B I r r e g u l a r F o r m . F O R M _ T Y P E _ I R R E G U L A R )  
 	 	 	 	 {  
 	 	 	 	 	 s E x e c p t i o n M a r k   =   "   [   *   ] " ;  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 s E x e c p t i o n M a r k   =   " " ;  
 	 	 	 	 }  
 	 	 	 	  
 	 	 	 	 i f ( i = = 0 )  
 	 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( o F o r m . G e t N a t u r a l F o r m ( )   +   s E x e c p t i o n M a r k   +   "   [ "   +   o F o r m . G e t W o r d ( ) . G e t F r e q u e n c y ( )   +   " ] " ) ;  
 	 	 	 	 e l s e  
 	 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( " ,   "   +   o F o r m . G e t N a t u r a l F o r m ( )   +   s E x e c p t i o n M a r k   +   "   [ "   +   o F o r m . G e t W o r d ( ) . G e t F r e q u e n c y ( )   +   " ] " ) ;  
 	 	 	 }  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " " ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( s T y p e   +   " - "   +   s S u b T y p e   +   "   =   N O T _ D E F I N E D " ) ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   v o i d   P r i n t S u m m a r y ( )  
 	 {  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " N O U N   :   L e m m a = "   +   o _ L e m m a . G e t N a t u r a l F o r m ( )   +     "   :   R u l e = "   +   o _ R u l e S e t . G e t N a m e ( )   +   "   :   S c o r e = "   +   l _ S c o r e ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " " ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 { 	 	  
 	 	 P r i n t S u m m a r y ( ) ; 	 	  
 	 	  
         	 f o r ( i n t   i = 0 ;   i < 9 ;   i + + )  
         	 {  
         	 	 D e b u g P r i n t F o r m ( H B N o u n . a r r _ V i b h a k t h i _ s [ i ] ,   " D S " ,   G e t N o u n F o r m s ( i ,   0 ) ) ;  
         	 	 D e b u g P r i n t F o r m ( H B N o u n . a r r _ V i b h a k t h i _ s [ i ] ,   " I S " ,   G e t N o u n F o r m s ( i ,   1 ) ) ;  
         	 	 D e b u g P r i n t F o r m ( H B N o u n . a r r _ V i b h a k t h i _ s [ i ] ,   " P L " ,   G e t N o u n F o r m s ( i ,   2 ) ) ;         	 	  
         	 }  
 	 }  
 }  

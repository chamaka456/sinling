 p a c k a g e   h e l a b a s a . n o u n s ;  
  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B N o u n C o n j u g a t i o n R u l e s   {  
  
 	 L i s t < H B T r a n s f o r m R u l e S e t >   l i s t _ R u l e S e t   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e S e t > ( ) ;  
 	  
 	 p u b l i c   H B N o u n C o n j u g a t i o n R u l e s ( )   {  
 	 	 L o a d R u l e s ( ) ;  
 	 }  
  
 	 p r i v a t e   v o i d   L o a d R u l e s ( )  
 	 {  
 	 	 / / T O D O   L o a d   N o u n   R u l e   S e t s   f r o m   f i l e  
 	 	 / /���  
 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * G " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 1 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 / /���  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +� " ) ;    
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 2 ) ;  
 	 	 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	 / /�����  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - D S = L M +��� " ) ; 	 	  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " A L - P L = L M +��� " ) ; 	  
 	 	 o R u l e S e t . S e t N a m e ( "�����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 3 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	  
 	 	 / /���  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = * G " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 4 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	  
 	 	 / /���  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "���  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 5 ) ;  
 	 	 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	  
 	 	 / /��  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M " ) ;    
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "��  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 6 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ;  
 	 	  
 	 	 / /����  
 	 	 o R u l e S e t   =   H B T r a n s f o r m R u l e S e t . E x t r a c t R u l e S e t ( " N N - L M = *� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - I S = L M +���� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " P R - P L = L M +�� " ) ;    
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - D S = L M +�� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - I S = L M +��� " ) ;  
 	 	 o R u l e S e t . E x t r a c t R u l e ( " K R - P L = L M +���� " ) ;  
 	 	 o R u l e S e t . S e t N a m e ( "����  ��� " ) ;  
 	 	 o R u l e S e t . S e t I D ( 7 ) ;  
 	 	  
 	 	 l i s t _ R u l e S e t . a d d ( o R u l e S e t ) ; 	 	  
 	 	  
 	 }  
  
 	 p u b l i c   L i s t < H B T r a n s f o r m R u l e S e t >   G e t R u l e S e t L i s t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ R u l e S e t ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t B y N a m e ( S t r i n g   s N a m e )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ;  
 	 	 	 i f ( o R u l e S e t . G e t N a m e ( ) . e q u a l s ( s N a m e ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   o R u l e S e t ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t B y I D ( i n t   i I D )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e S e t . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t _ R u l e S e t . g e t ( i ) ;  
 	 	 	 i f ( o R u l e S e t . G e t I D ( ) = = i I D )  
 	 	 	 {  
 	 	 	 	 r e t u r n   o R u l e S e t ;  
 	 	 	 }  
 	 	 } 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 }  

import java.awt.*;
import java.awt.event.*;


class MyFreehead2 extends Frame {

    int i, j;
    Panel p = new Panel();
    Panel p2 = new Panel(new FlowLayout());
    Button bt = new Button ("CLEAR");
    TextField tf[][] = new TextField[2][14];

    Color colors[][] ={{new Color(0,0,0),
            new Color( 128, 128, 128 ),
            new Color( 128, 0, 0 ),   
            new Color( 128, 128, 64 ),
            new Color( 0, 128, 0 ),  
            new Color( 64, 128, 128 ),
            new Color( 0, 0, 128 ),
            new Color( 128, 0, 128 ),
            new Color( 128, 128, 0 ), 
            new Color( 0, 64, 0 ),
            new Color( 0, 128, 255 ), 
            new Color( 0, 64, 128 ),
            new Color( 128, 0, 225 ), 
            new Color( 128, 64, 64 )
    	},
        { new Color( 255, 255, 255 ), 
            new Color( 192, 192, 192),
            new Color( 255, 0, 0 ),
            new Color( 255, 255, 0 ),
            new Color( 0, 255, 0 ),     
            new Color( 0, 255, 255 ),
            new Color( 0, 0, 255 ),     
            new Color( 255, 0, 255 ),
            new Color( 255, 255, 128 ), 
            new Color( 0, 255, 128 ),
            new Color( 128, 255, 255 ),
            new Color( 128, 128, 255 ),
            new Color( 255, 0, 128 ),
            new Color( 255, 128, 128 )
        }
    };

     MyFreehead2(){
    setLayout(new BorderLayout());
        p.setLayout(new GridLayout(2, 14));
        addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent we){
              System.exit(0);
           }
    });
    for ( i=0; i < tf.length   ; i++)
    for ( j=0; j < tf[i].length; j++) {
   tf[i][j] = new TextField("") ;
   tf[i][j].setBackground( colors[i][j] ) ;
   tf[i][j].setBounds( 50 +j * 16, 510 + i*16, 16, 16 ) ;
   p.add( tf[i][j] ) ;
   tf[i][j].setEditable( false ) ;
    } 
    p2.add(bt);
       add("North", p2);
       add("South", p);
       add("Center", new MyCanvas());
       setSize(500, 400);
       setVisible(true);
     }
     
    public static void main(String[] args) throws Exception {
      new MyFreehead2();
    }

    class MyCanvas extends Canvas {
        int k, x, y, lastX=0 , lastY=0 ;
        int width, height;
        Color col = Color.blue;
        Graphics g = getGraphics();
 
        MyCanvas() {
          setWidth(200);
          setHeight(200);
          tf[0][0].addMouseListener(new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {  
                   if (me.getSource() == tf[0][0]) {
                      col = tf[0][0].getBackground();    
                      g.setColor(col);
                   } 
               }
          });
          tf[0][1].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {  
               if (me.getSource() == tf[0][1]) {
                  col = tf[0][1].getBackground();    
                  g.setColor(col);
               } 
            }
        });
        tf[0][2].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {  
               if (me.getSource() == tf[0][2]) {
                  col = tf[0][2].getBackground();    
                  g.setColor(col);
               } 
            }
        });
        
          tf[0][3].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[0][3]) {
                    col = tf[0][3].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][4].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[0][4]) {
                    col = tf[0][4].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][5].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {     
                 if (me.getSource() == tf[0][5]) {
                    col = tf[0][5].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][6].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {     
                 if (me.getSource() == tf[0][6]) {
                    col = tf[0][6].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][7].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {   
                 if (me.getSource() == tf[0][7]) {
                    col = tf[0][7].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][8].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[0][8]) {
                    col = tf[0][8].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][9].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[0][9]) {
                    col = tf[0][9].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][10].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[0][10]) {
                    col = tf[0][10].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][11].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[0][11]) {
                    col = tf[0][11].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][12].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {    
                 if (me.getSource() == tf[0][12]) {
                    col = tf[0][12].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[0][13].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[0][13]) {
                    col = tf[0][13].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][0].addMouseListener(new MouseAdapter() { 
              public void mouseClicked(MouseEvent me) {  
                  if (me.getSource() == tf[1][0]) {
                     col = tf[1][0].getBackground();    
                     g.setColor(col);
                  } 
              }
         });
         tf[1][1].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[1][1]) {
                    col = tf[1][1].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][2].addMouseListener(new MouseAdapter() {

    public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[1][2]) {
                    col = tf[1][2].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][3].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[1][3]) {
                    col = tf[1][3].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][4].addMouseListener(new MouseAdapter() {   
              public void mouseClicked(MouseEvent me) {        
                 if (me.getSource() == tf[1][4]) {
                    col = tf[1][4].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][5].addMouseListener(new MouseAdapter() {   
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[1][5]) {
                    col = tf[1][5].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][6].addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent me) {       
                 if (me.getSource() == tf[1][6]) {
                    col = tf[1][6].getBackground();    
                    g.setColor(col);
                 } 
              }
          });

         tf[1][7].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {        
                 if (me.getSource() == tf[1][7]) {
                    col = tf[1][7].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][8].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {   
                 if (me.getSource() == tf[1][8]) {
                    col = tf[1][8].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][9].addMouseListener(new MouseAdapter() { 
              public void mouseClicked(MouseEvent me) {      
                 if (me.getSource() == tf[1][9]) {
                    col = tf[1][9].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][10].addMouseListener(new MouseAdapter() { 
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[1][10]) {
                    col = tf[1][10].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][11].addMouseListener(new MouseAdapter() {    
              public void mouseClicked(MouseEvent me) {      
                 if (me.getSource() == tf[1][11]) {
                    col = tf[1][11].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
         tf[1][12].addMouseListener(new MouseAdapter() {   
              public void mouseClicked(MouseEvent me) {       
                 if (me.getSource() == tf[1][12]) {
                    col = tf[1][12].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
          tf[1][13].addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent me) {  
                 if (me.getSource() == tf[1][13]) {
                    col = tf[1][13].getBackground();    
                    g.setColor(col);
                 } 
              }
          });
      addMouseListener(new MouseAdapter() {
           public void mousePressed(MouseEvent me){
              x = me.getX(); 
              y = me.getY();
              lastX = x;
              lastY = y;
           }    
      });
      addMouseMotionListener(new MouseMotionAdapter(){
          public void mouseDragged(MouseEvent me) {
            g = getGraphics();
            x = me.getX(); 
            y = me.getY();
            g.setColor(col);
            g.drawLine(lastX, lastY, x, y);
            lastX = x;
            lastY = y;
          }
      });   
      bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                Graphics g = getGraphics();
                g.setColor(getBackground());
                g.clearRect(0, 0, getSize().width, getSize().height); 
            }
      });
   }
   void setWidth(int w) { width = w; }
   void setHeight(int h) { height = h; }
 }

}

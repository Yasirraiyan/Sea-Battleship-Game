public class Soldier
{
public int size; 
public int x; 
public int y; 
public int z; 
public int turn=5;
public boolean attacked=false; 
public int life=50; 
public int capacity; 
public int soldierrank; 
public Ship(int size,int x,int y,int z,int turn,boolean attacked,int life,int capacity,int soldierrank)
{
    this.size=size; 
    this.x=x; 
    this.y=y; 
    this.z=z; 
    this.turn=turn; 
    this.attacked=attacked;
    this.life=life;
    this.capacity=capacity; 
    this.soldierrank=soldierrank;
    } 
    public int getsize()
    { 
        System.out.println("The size of ship is:"+size); 
        return size;
        } 
        public (int,int) getposition2dcoordinates(int x,int y)
        { 
            if(x==0&&y==0) 
            { 
                System.out.println("The position of the ship is in center.And it is:"+(x,y));
                } 
                if(x>0&&y==0)
                {
                    System.out.println("The position of the ship is in positive side in x-axis.And it lies in x-axis .And it is:"+(x,y));
                    }
                    if(x>0&&y>0) 
                    { 
                        System.out.println("The position of the ship is in 1st quadrent .And it is:"+(x,y)); 
                        
                    }
                    if(x==0&&y>0)
                    { 
                        System.out.println("The position of the ship is in positive side in y-axis.And it lies in y-axis .And it is:"+(x,y)); 
                        
                    } 
                    if(x<0&&y>0)
                    { 
                        System.out.println("The position of the ship is in 2nd quadrent .And it is:"+(x,y))
                        ;
                        }
                        if(x<0&&y==0) 
                        {
                            System.out.println("The position of the ship is in negative side in x-axis.And it lies in x-axis .And it is:"+(x,y));
                            } 
                            if(x<0&&y<0) 
                            {
                                System.out.println("The position of the ship is in 3rd quadrent .And it is:"+(x,y));
                                } 
                                if(x==0&&y<0)
                                { 
                                    System.out.println("The position of the ship is in negative side in y-axis.And it lies in y-axis .And it is:"+(x,y)); 
                                    
                                }
                                if(x>0&&y<0)
                                { 
                                    System.out.println("The position of the ship is in 4th quadrent .And it is:"+(x,y)); 
                                    
                                } 
            
        } 
        public (int,int,int) getpositionin3dcoordinates(int x,int y,int z)
        {
            System.out.println("The position of the ship in 3-d coordinates is"+(x,y,z)); return (x,y,z);
            }
            public (boolean,int) attack(boolean attack,int life) 
            { 
                if(!attacked)
                {
                    while(life>0)
                    { 
                        life=life/5;
                      }
                }
    System.out.println("The ship is attacked. And the present life is:"+life); 
                        if(life==0)
                        { 
                            System.out.println("Ship is expired.Because thee present life of ship is 0.");
                            }
                            return(attack,life); 
                
            } 
            public (int,int) useship(int size,int capacity) 
            { 
                if(size>100&& capacity>50) 
                { 
                    System.out.println("The ship is first catagory ship.The size and capacity of the ship is:"+(size,capacity));
                    }
                    if(size>80&& capacity>30) 
                    { 
                        System.out.println("The ship is second catagory ship.The size and capacity of the ship is:"+(size,capacity)); 
                        
                    }
                    if(size>60&& capacity>20)
                    { 
                        System.out.println("The ship is third catagory ship.The size and capacity of the ship is:"+(size,capacity));
                        } 
                        public void getdamage(int life,boolean attack)
                        { 
                            if(!attack) 
                            { 
                                life=life/5;
                                } 
                                if(life==0)
                                { 
                                    System.out.println("The ship is fully damaged.");
                                    } 
                            
                        }
                        public void getsoldiertype(int soldierrank) { if(soldierrank==1)
                        {
                            System.out.println("The soldier is general."); } if(soldierrank==2) 
                            {
                                System.out.println("The soldier is colonel."); }
                                if(soldierrank==3) 
                                { 
                                    System.out.println("The soldier is major."); 
                                    
                                } 
                                if(soldierrank==4) 
                                    {
                                        System.out.println("The soldier is captain."); 
                                        
                                    } 
                                    if(soldierrank==5) 
                                        { 
                                            System.out.println("The soldier is sergent.");
                                            } if(soldierrank==6) 
                                            { 
                                                System.out.println("The soldier is private.");
                                                }
                                                } 
                                                public int getsoldierrank(int soldierrank) 
                                                { 
                                                    System.out.println("The soldier rank is :"+soldierrank);
                                                    return soldierrank; 
                                                    
                                                } 
                                                public void servive(int turn,boolean attack,int life) 
                                                { 
                                                    if(!attack) 
                                                    { 
                                                        turn-=1; 
                                                        life=life/10;
                                                        } 
   System.out.println("The ship now survived.The present life is:"+life."The remaining turn is:"+turn); 
   if(life==0||turn==0)
   { 
       System.out.println("The ship is not survived.");
       }
       }
       } 
    
}

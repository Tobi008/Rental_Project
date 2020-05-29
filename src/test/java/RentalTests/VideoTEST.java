package RentalTests;

import junit.framework.Assert;
import junit.framework.TestCase;
import shop.data.VideoObj;

// TODO:  complete the tests
public class VideoTEST extends TestCase {
  public VideoTEST(String name) {
    super(name);
  }
  public void testEquals() { 
    // TODO  
	  String title = "A";
	    int year = 2009;
	    String director = "Zebra";
	    VideoObj a = new VideoObj(title,year,director);
	    assertTrue( a.equals(a) );
	    assertTrue( a.equals( new VideoObj(title, year, director) ) );
	    assertTrue( a.equals( new VideoObj(new String(title), year, director) ) );
	    assertTrue( a.equals( new VideoObj(title, year, new String(director)) ) );
	    assertFalse( a.equals( new VideoObj(title+"1", year, director) ) );
	    assertFalse( a.equals( new VideoObj(title, year+1, director) ) );
	    assertFalse( a.equals( new VideoObj(title, year, director+"1") ) );
	    assertFalse( a.equals( new Object() ) );
	    assertFalse( a.equals( null ) );
	  

  }

  public void testCompareTo() { 
    // TODO  
	  String title = "A", title2 = "B";
	    int year = 2009, year2 = 2010;
	    String director = "Zebra", director2 = "Zzz";
	    VideoObj a = new VideoObj(title,year,director);
	    VideoObj b = new VideoObj(title2,year,director);
	    assertTrue( a.compareTo(b) < 0 );
	    assertTrue( a.compareTo(b) == -b.compareTo(a) );
	    assertTrue( a.compareTo(a) == 0 );

	    b = new VideoObj(title,year2,director);
	    assertTrue( a.compareTo(b) < 0 );
	    assertTrue( a.compareTo(b) == -b.compareTo(a) );

	    b = new VideoObj(title,year,director2);
	    assertTrue( a.compareTo(b) < 0 );
	    assertTrue( a.compareTo(b) == -b.compareTo(a) );

	    b = new VideoObj(title2,year2,director2);
	    assertTrue( a.compareTo(b) < 0 );
	    assertTrue( a.compareTo(b) == -b.compareTo(a) );

	    try {
	      a.compareTo(null);
	      fail();
	    } catch ( NullPointerException e ) {}

  }

  public void testToString() { 
    // TODO  
	  VideoObj vid4 = new VideoObj("none", 2012, "zebra");
	    
	    String answer = "none (2012) : zebra";
	    assertTrue(vid4.toString().equals(answer));
	  
  }

  public void testHashCode() {
    assertEquals
      (-875826552,
       new VideoObj("None", 2009, "Zebra").hashCode());
    assertEquals
      (-1391078111,
       new VideoObj("Blah", 1954, "Cante").hashCode());
  }
}

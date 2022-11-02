1.  Using the high-level API, you don't actually even need to know about ports and sockets.
    
2.  You'll use URIs and URLs in the high level api
    
3.  URI stands for universal resource identifier and URL stands for universal resource locator.
    
4.  Now when working with a java.net package a URI is an identifier that might not provide enough information.
    
5.  URL, one on the other hand, is an identifier that includes information.
    
6.  URI can specify a relative path but a URL has to be an absolute path. Because when we use the URL, it has to contain enough information to locate and access the resource that it identifies.
    
7.  So a scheme is part of a URI or URL that appears before the colon.
    
    For example, http file and ftp well they're all schemes.
    
8.  So another way to define a URL is that it's a http URI.
    
9.  low-level API, we used the following classes, socket server, socket, and datagram socket. When working with the high-level API, we're going to be using the following classes, URI, URL, URL connection as well as HTTP URL connection,
    
10.  URI can actually contain 9 components.
    
11.  The scheme number 
12.

        1 the scheme specific part number.
        2 the authority number. 
        3 the user info. Number 
        4  the host. Number 
        5 host. 
        6 is the port 
        7. path. 
        8 query. 
        9. fragment.
    
12.  So URIs that specify a scheme here. Well, they're called absolute URIs.
    
13.  And when a URI doesn't specify a scheme, it's actually called a relative URI.
    
14.  URL can not be relative path, it must be absolute path. Or it will gives MalformedURLException. So, when we try to convert uri to url, we have to select absolute uri , not relative uri. As it represents completly information about resources.
15.![enter image description here](https://user-images.githubusercontent.com/75389185/199384281-ed57da59-ce88-4f26-8abf-f7bfb71663f9.png)IF We try to convert relative path of the uri to url. It gives MalformedURLException . As url accepts absolute path not relative path.
In the coded section, we have provided code, You can try several experiment on the code. And try to understand the various nature of uri and url.
## Code

  
package HihgLevelApi;    
import java.net.MalformedURLException;  
import java.net.URI;  
import java.net.URISyntaxException;  
import java.net.URL;  
public class uri {  
        public static void main(String[] args) {  
                try {  
                        URI uri = new URI("/tutorials/uri-vs-url#:~:text=URI%20identifies%20a%20resource%20and,a%20domain%20name%20and%20port.");  
  URL url = uri.toURL();  
  System.out.println(url);  
  System.out.println("Scheme: "+ uri.getScheme());  
  System.out.println("Scheme-specefic part: " +uri.getRawSchemeSpecificPart());  
  System.out.println("Authority: "+ uri.getAuthority());  
  System.out.println("User info: "+ uri.getHost());  
  System.out.println("Port: "+ uri.getPort());  
  System.out.println("Path: "+ uri.getPath());  
  System.out.println("Quey: "+uri.getQuery());  
  System.out.println("Fragment: "+ uri.getFragment());  
  } catch (URISyntaxException ex) {  
                        System.out.println("Syntax Error: " + ex.getMessage());  
  } catch (MalformedURLException e) {  
                       System.out.println("URL MALform: " + e.getMessage());  
  }  
     }    
}

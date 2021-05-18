package java10;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory(){
        @Override
        public Thread newThread(Runnable runnable){
            Thread thread = new Thread(runnable);
            System.out.println("Nova thread criada :: " + (thread.isDaemon() ? "daemon" : "") + " Thread Group :: "+ thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws IOException, InterruptedException {
        connectAndPrintURL();
        connectAKanaiHttp11Client();


    }

    private static void connectAKanaiHttp11Client(){
        System.out.println("Running HTTP/1.1 example ...");
        try{
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();
            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html")).build();

            HttpResponse response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code :: "+response.statusCode());
            System.out.println("Response Header :: "+response.headers());
            String responseBody = (String) response.body();
            System.out.println(responseBody);

            List<Future> futures = new ArrayList<>();

            responseBody.lines().filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='")+ 5, line.indexOf("'/>")))
                    .forEach(image -> System.out.println());


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void connectAndPrintURL() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://docs.oracle.com/javase/10/language/")).build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code ::"+response.statusCode());
        System.out.println("Header response ::"+response.headers());
        System.out.println(response.body());
    }
//Mesmo resultado com o codigo a cima
//    public static void connectAndPrintURL() throws IOException {
//        URL url = new URL("http://valdoneves.orgfree.com");
//        URLConnection urlConnection = url.openConnection();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//
//        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
//
//    }
}
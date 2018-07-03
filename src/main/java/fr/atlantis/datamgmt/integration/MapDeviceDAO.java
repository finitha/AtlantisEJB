package fr.atlantis.datamgmt.integration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.atlantis.datamgmt.domain.Calculated;
import fr.atlantis.datamgmt.domain.Device;
import fr.atlantis.datamgmt.domain.Measure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author gmartin
 */
@ApplicationScoped
public class MapDeviceDAO implements DeviceDAO {

    @Override
    public List<Device> lookUpAllUserDevices(String id) {
        try {
             String sURL = "http://35.198.113.233:5984/device/_design/device/_view/userId?key=\""+id+"\"";
             JSONObject obj;
             InputStream is = new URL(sURL).openStream();
             try{
                 BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                 StringBuilder sb = new StringBuilder();
                 int cp;
                 while((cp = rd.read()) != -1){
                     sb.append((char) cp);
                     
                 }
                 String jsonText = sb.toString();
                 obj = new JSONObject(jsonText);                 
             } finally{
                 is.close();
             }
             
             
             
             List<Device> device = new ArrayList<Device>();
            
            JSONArray jsonSource = obj.getJSONArray("rows");
            for(int i=0; i< jsonSource.length(); i++){
                JSONObject objectJSON = jsonSource.getJSONObject(i);
                String stringSource = objectJSON.getJSONObject("value").toString();
                ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                device.add(mapper.readValue(stringSource, Device.class));
                
            }
            return device;
        } catch (MalformedURLException ex) {
            Logger.getLogger(MapDeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MapDeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Measure> lookUpAllDeviceMeasures(String id) {
        try {
             String sURL = "http://35.198.113.233:5984/metric/_design/measure/_view/deviceId?startkey=[%22"+id+"%22,%222258-06-27T12:09:37.153Z%22]&endkey=[%22"+id+"%22,%222008-06-27T12:09:37.153Z%22]&descending=true&limit=1";
             JSONObject obj;
             InputStream is = new URL(sURL).openStream();
             try{
                 BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                 StringBuilder sb = new StringBuilder();
                 int cp;
                 while((cp = rd.read()) != -1){
                     sb.append((char) cp);
                     
                 }
                 String jsonText = sb.toString();
                 obj = new JSONObject(jsonText);                 
             } finally{
                 is.close();
             }
             
             
             
             List<Measure> measure = new ArrayList<Measure>();
            
            JSONArray jsonSource = obj.getJSONArray("rows");
            for(int i=0; i< jsonSource.length(); i++){
                JSONObject objectJSON = jsonSource.getJSONObject(i);
                String stringSource = objectJSON.getJSONObject("value").toString();
                ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                measure.add(mapper.readValue(stringSource, Measure.class));
                
            }
            return measure;
        } catch (MalformedURLException ex) {
            Logger.getLogger(MapDeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MapDeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    

    @Override
    public List<Calculated> lookUpAllDeviceCalculated(String id) {
        try {
             String sURL = "http://35.205.104.50:5984/calculated/_design/calculated/_view/deviceId?startkey=[%22"+id+"%22,%22day%22,%22367%22]&endkey=[%22"+id+"%22,%22day%22,%220%22]&descending=true&limit=1";
             JSONObject obj;
             InputStream is = new URL(sURL).openStream();
             try{
                 BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                 StringBuilder sb = new StringBuilder();
                 int cp;
                 while((cp = rd.read()) != -1){
                     sb.append((char) cp);
                     
                 }
                 String jsonText = sb.toString();
                 obj = new JSONObject(jsonText);                 
             } finally{
                 is.close();
             }
             
             
             
             List<Calculated> calculated = new ArrayList<Calculated>();
            
            JSONArray jsonSource = obj.getJSONArray("rows");
            for(int i=0; i< jsonSource.length(); i++){
                JSONObject objectJSON = jsonSource.getJSONObject(i);
                String stringSource = objectJSON.getJSONObject("value").toString();
                ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                calculated.add(mapper.readValue(stringSource, Calculated.class));
                
            }
            
            sURL = "http://35.205.104.50:5984/calculated/_design/calculated/_view/deviceId?startkey=[%22"+id+"%22,%22Semaine%22,%2253%22]&endkey=[%22"+id+"%22,%22Semaine%22,%220%22]&descending=true&limit=1";
             is = new URL(sURL).openStream();
             try{
                 BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                 StringBuilder sb = new StringBuilder();
                 int cp;
                 while((cp = rd.read()) != -1){
                     sb.append((char) cp);
                     
                 }
                 String jsonText = sb.toString();
                 obj = new JSONObject(jsonText);                 
             } finally{
                 is.close();
             }
            jsonSource = obj.getJSONArray("rows");
            for(int i=0; i< jsonSource.length(); i++){
                JSONObject objectJSON = jsonSource.getJSONObject(i);
                String stringSource = objectJSON.getJSONObject("value").toString();
                ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                calculated.add(mapper.readValue(stringSource, Calculated.class));
                
            }
            
            return calculated;
        } catch (MalformedURLException ex) {
            Logger.getLogger(MapDeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MapDeviceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

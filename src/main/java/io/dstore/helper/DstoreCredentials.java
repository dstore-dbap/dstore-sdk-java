package io.dstore.helper;

import com.google.auth.Credentials;

import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bdolkemeier on 22.06.15.
 */
public class DstoreCredentials extends Credentials {

    String username;
    String password;

    public DstoreCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getAuthenticationType() {
        return "dstoreCredentials";
    }

    @Override
    public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
        Map<String, List<String>> result = new HashMap<String, List<String>>();

        result.put("Username", Collections.singletonList(username));
        result.put("Password", Collections.singletonList(password));

        return result;
    }

    @Override
    public boolean hasRequestMetadata() {
        return true;
    }

    @Override
    public boolean hasRequestMetadataOnly() {
        return true;
    }

    @Override
    public void refresh() throws IOException {

    }
}

/*
 * MimePost API Reference (Beta)
 * MimePost API for sending email.  You can find out more about MimePost at [https://mimepost.com](http://mimepost.com). For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: support@mimepost.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import com.mimepost.ApiException;
import com.mimepost.model.ApiResponseAllWebhooks;
import com.mimepost.model.ApiResponseSingleWebhooks;
import com.mimepost.model.ApiResponseWebhooks;
import com.mimepost.model.ModelApiResponse;
import com.mimepost.model.Webhook;
import com.mimepost.model.Webhook1;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Ignore
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    
    /**
     * Get the list of all the webhooks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webhooksGetTest() throws ApiException {
        ApiResponseAllWebhooks response = api.webhooksGet();

        // TODO: test validations
    }
    
    /**
     * Remove a single webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webhooksIdDeleteTest() throws ApiException {
        Integer id = null;
        ModelApiResponse response = api.webhooksIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * Get the details of a single webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webhooksIdGetTest() throws ApiException {
        Integer id = null;
        ApiResponseSingleWebhooks response = api.webhooksIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Update the details of a single webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webhooksIdPutTest() throws ApiException {
        Integer id = null;
        Webhook1 webhook = null;
        ApiResponseSingleWebhooks response = api.webhooksIdPut(id, webhook);

        // TODO: test validations
    }
    
    /**
     * Add single webhook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webhooksPostTest() throws ApiException {
        Webhook webhook = null;
        ApiResponseWebhooks response = api.webhooksPost(webhook);

        // TODO: test validations
    }
    
}

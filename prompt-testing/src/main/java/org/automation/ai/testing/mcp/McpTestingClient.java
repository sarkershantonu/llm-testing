package org.automation.ai.testing.mcp;

import io.modelcontextprotocol.client.McpAsyncClient;
import io.modelcontextprotocol.client.McpClient;
import io.modelcontextprotocol.client.McpSyncClient;
import org.automation.ai.testing.context.McpContext;

public class McpTestingClient {
    private McpAsyncClient asyncClient;
    private McpSyncClient syncClient;
    private final McpContext context;

    public McpTestingClient(McpContext context) {
        this.context = context;
    }
    private McpClient getSyncClient(){
        return null;
    }
    private McpClient getAsyncClient(){
        return null;
    }
}

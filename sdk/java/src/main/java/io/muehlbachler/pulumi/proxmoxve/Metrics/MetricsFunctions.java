// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Metrics;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import io.muehlbachler.pulumi.proxmoxve.Metrics.inputs.GetServerArgs;
import io.muehlbachler.pulumi.proxmoxve.Metrics.inputs.GetServerPlainArgs;
import io.muehlbachler.pulumi.proxmoxve.Metrics.outputs.GetServerResult;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.util.concurrent.CompletableFuture;

public final class MetricsFunctions {
    /**
     * Retrieves information about a specific PVE metric server.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.proxmoxve.Metrics.MetricsFunctions;
     * import com.pulumi.proxmoxve.Metrics.inputs.GetServerArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = MetricsFunctions.getServer(GetServerArgs.builder()
     *             .name("example_influxdb")
     *             .build());
     * 
     *         ctx.export("dataProxmoxVirtualEnvironmentMetricsServer", Map.ofEntries(
     *             Map.entry("server", example.server()),
     *             Map.entry("port", example.port())
     *         ));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args) {
        return getServer(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves information about a specific PVE metric server.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.proxmoxve.Metrics.MetricsFunctions;
     * import com.pulumi.proxmoxve.Metrics.inputs.GetServerArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = MetricsFunctions.getServer(GetServerArgs.builder()
     *             .name("example_influxdb")
     *             .build());
     * 
     *         ctx.export("dataProxmoxVirtualEnvironmentMetricsServer", Map.ofEntries(
     *             Map.entry("server", example.server()),
     *             Map.entry("port", example.port())
     *         ));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args) {
        return getServerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves information about a specific PVE metric server.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.proxmoxve.Metrics.MetricsFunctions;
     * import com.pulumi.proxmoxve.Metrics.inputs.GetServerArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = MetricsFunctions.getServer(GetServerArgs.builder()
     *             .name("example_influxdb")
     *             .build());
     * 
     *         ctx.export("dataProxmoxVirtualEnvironmentMetricsServer", Map.ofEntries(
     *             Map.entry("server", example.server()),
     *             Map.entry("port", example.port())
     *         ));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:Metrics/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves information about a specific PVE metric server.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.proxmoxve.Metrics.MetricsFunctions;
     * import com.pulumi.proxmoxve.Metrics.inputs.GetServerArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = MetricsFunctions.getServer(GetServerArgs.builder()
     *             .name("example_influxdb")
     *             .build());
     * 
     *         ctx.export("dataProxmoxVirtualEnvironmentMetricsServer", Map.ofEntries(
     *             Map.entry("server", example.server()),
     *             Map.entry("port", example.port())
     *         ));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:Metrics/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves information about a specific PVE metric server.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.proxmoxve.Metrics.MetricsFunctions;
     * import com.pulumi.proxmoxve.Metrics.inputs.GetServerArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = MetricsFunctions.getServer(GetServerArgs.builder()
     *             .name("example_influxdb")
     *             .build());
     * 
     *         ctx.export("dataProxmoxVirtualEnvironmentMetricsServer", Map.ofEntries(
     *             Map.entry("server", example.server()),
     *             Map.entry("port", example.port())
     *         ));
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("proxmoxve:Metrics/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
}

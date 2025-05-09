// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import io.muehlbachler.pulumi.proxmoxve.inputs.GetContainerArgs;
import io.muehlbachler.pulumi.proxmoxve.inputs.GetContainerPlainArgs;
import io.muehlbachler.pulumi.proxmoxve.inputs.GetNodeArgs;
import io.muehlbachler.pulumi.proxmoxve.inputs.GetNodePlainArgs;
import io.muehlbachler.pulumi.proxmoxve.inputs.GetVm2Args;
import io.muehlbachler.pulumi.proxmoxve.inputs.GetVm2PlainArgs;
import io.muehlbachler.pulumi.proxmoxve.outputs.GetContainerResult;
import io.muehlbachler.pulumi.proxmoxve.outputs.GetNodeResult;
import io.muehlbachler.pulumi.proxmoxve.outputs.GetVm2Result;
import java.util.concurrent.CompletableFuture;

public final class ProxmoxveFunctions {
    /**
     * Retrieves information about a specific Container.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetContainerArgs;
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
     *         final var testContainer = ProxmoxveFunctions.getContainer(GetContainerArgs.builder()
     *             .nodeName("test")
     *             .vmId(100)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetContainerResult> getContainer(GetContainerArgs args) {
        return getContainer(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves information about a specific Container.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetContainerArgs;
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
     *         final var testContainer = ProxmoxveFunctions.getContainer(GetContainerArgs.builder()
     *             .nodeName("test")
     *             .vmId(100)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetContainerResult> getContainerPlain(GetContainerPlainArgs args) {
        return getContainerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves information about a specific Container.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetContainerArgs;
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
     *         final var testContainer = ProxmoxveFunctions.getContainer(GetContainerArgs.builder()
     *             .nodeName("test")
     *             .vmId(100)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetContainerResult> getContainer(GetContainerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:index/getContainer:getContainer", TypeShape.of(GetContainerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves information about a specific Container.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetContainerArgs;
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
     *         final var testContainer = ProxmoxveFunctions.getContainer(GetContainerArgs.builder()
     *             .nodeName("test")
     *             .vmId(100)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetContainerResult> getContainer(GetContainerArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:index/getContainer:getContainer", TypeShape.of(GetContainerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves information about a specific Container.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetContainerArgs;
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
     *         final var testContainer = ProxmoxveFunctions.getContainer(GetContainerArgs.builder()
     *             .nodeName("test")
     *             .vmId(100)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetContainerResult> getContainerPlain(GetContainerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("proxmoxve:index/getContainer:getContainer", TypeShape.of(GetContainerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves information about node.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetNodeArgs;
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
     *         final var node = ProxmoxveFunctions.getNode(GetNodeArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeResult> getNode(GetNodeArgs args) {
        return getNode(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves information about node.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetNodeArgs;
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
     *         final var node = ProxmoxveFunctions.getNode(GetNodeArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeResult> getNodePlain(GetNodePlainArgs args) {
        return getNodePlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves information about node.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetNodeArgs;
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
     *         final var node = ProxmoxveFunctions.getNode(GetNodeArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeResult> getNode(GetNodeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:index/getNode:getNode", TypeShape.of(GetNodeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves information about node.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetNodeArgs;
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
     *         final var node = ProxmoxveFunctions.getNode(GetNodeArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetNodeResult> getNode(GetNodeArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:index/getNode:getNode", TypeShape.of(GetNodeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves information about node.
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
     * import com.pulumi.proxmoxve.ProxmoxveFunctions;
     * import com.pulumi.proxmoxve.inputs.GetNodeArgs;
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
     *         final var node = ProxmoxveFunctions.getNode(GetNodeArgs.builder()
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetNodeResult> getNodePlain(GetNodePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("proxmoxve:index/getNode:getNode", TypeShape.of(GetNodeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **DO NOT USE**
     * This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.
     * 
     */
    public static Output<GetVm2Result> getVm2(GetVm2Args args) {
        return getVm2(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **DO NOT USE**
     * This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.
     * 
     */
    public static CompletableFuture<GetVm2Result> getVm2Plain(GetVm2PlainArgs args) {
        return getVm2Plain(args, InvokeOptions.Empty);
    }
    /**
     * !&gt; **DO NOT USE**
     * This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.
     * 
     */
    public static Output<GetVm2Result> getVm2(GetVm2Args args, InvokeOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:index/getVm2:getVm2", TypeShape.of(GetVm2Result.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **DO NOT USE**
     * This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.
     * 
     */
    public static Output<GetVm2Result> getVm2(GetVm2Args args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("proxmoxve:index/getVm2:getVm2", TypeShape.of(GetVm2Result.class), args, Utilities.withVersion(options));
    }
    /**
     * !&gt; **DO NOT USE**
     * This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.
     * 
     */
    public static CompletableFuture<GetVm2Result> getVm2Plain(GetVm2PlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("proxmoxve:index/getVm2:getVm2", TypeShape.of(GetVm2Result.class), args, Utilities.withVersion(options));
    }
}

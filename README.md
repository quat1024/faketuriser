# faketuriser

More information about "fracturiser" malware: https://github.com/fractureiser-investigation/fractureiser

`faketuriser` is a jar with the same interface as Stage 1 of the malware, but instead of attempting to download Stage 2, it simply prints some information and exits. If exiting is blocked by a SecurityManager or something, it will loop infinitely instead.

## Building

1. Compile: `javac Utility.java`
2. Package: `jar cvfM dl.jar Utility.class`
3. Rename: `mv dl.jar dl` (or `move dl.jar dl` on Windows `cmd`, or `Rename-Item dl.jar dl` on PowerShell)

You can also use the provided scripts, or simply the provided binaries if you trust me 🕵️‍♂️

## Serving

Serve `dl.jar` over a Web server; it needs to be accessible under the path `http://[server address]:8080/dl`. No HTTPS, and no `.jar` extension in the URL.

I'm really not an nginx expert, but you can try the example nginx configuration - it expects to be `include`d from inside an `http { }` block.

## License

CC0
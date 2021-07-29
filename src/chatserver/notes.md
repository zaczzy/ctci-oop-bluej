# Things to discuss with interviewer
## How to know if someone is online
Periodic pings to the client

## How to deal with conflicts in server and DB?
Snapshots, discard all changes after the snapshot.
Have distributed queues, allow for eventual consistency on some numbers.
Consensus algorithms.

## How to make server scale?
Stateless servers, containerized application and replias.

Database relias need to be more well-thought out.
## How to prevent DOS attacks.
Make client do work? Detect IP? Distributed MSUs to handle load. Load balancers. DDoS filters, identify attack patterns, block traffic patterns.
For Volumetric attacks, blackhole the server they attack, sacrifice the IP. For Amplification attacks, black-hole the source when receive this specific signature. Over provision.

Firewalls. Better security software.
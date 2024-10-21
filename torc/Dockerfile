FROM alpine:3.18.4

RUN apk add --no-cache tor

# Copy torrc file (your Tor configuration)
COPY torrc /etc/tor/torrc

ENTRYPOINT [ "tor" ]


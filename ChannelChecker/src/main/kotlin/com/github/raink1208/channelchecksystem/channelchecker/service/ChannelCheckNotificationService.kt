package com.github.raink1208.channelchecksystem.channelchecker.service

import com.github.raink1208.channelchecksystem.protos.BackendServiceGrpc
import com.github.raink1208.channelchecksystem.protos.ChannelNotification
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class ChannelCheckNotificationService: BackendServiceGrpc.BackendServiceImplBase() {
    override fun registerNewVideoNotification(
        request: ChannelNotification.VideoNotificationRequest,
        responseObserver: StreamObserver<ChannelNotification.VideoNotificationResponse>
    ) {
    }
}
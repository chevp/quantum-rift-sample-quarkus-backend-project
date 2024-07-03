package io.desert.ipcde17.sn100c;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import desert.ipcde17.IPCStaticNodeService;
import desert.ipcde17.IdStruct;
import desert.ipcde17.NullValue;
import desert.ipcde17.Value;

@GrpcService
public class StaticNodeServiceImpl implements IPCStaticNodeService {

    @Override
    public Uni<NullValue> ping(NullValue request) {
        return Uni.createFrom().item(() -> NullValue.newBuilder().build());
    }

    @Override
    public Uni<NullValue> init(IdStruct request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'init'");
    }

    @Override
    public Uni<NullValue> insertNode(IdStruct request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertNode'");
    }

    @Override
    public Uni<NullValue> removeByNodeId(IdStruct request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeByNodeId'");
    }

    @Override
    public Uni<NullValue> removeByStubContextId(IdStruct request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeByStubContextId'");
    }

    @Override
    public Uni<Value> getAllByStubContextId(IdStruct request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllByStubContextId'");
    }

    @Override
    public Uni<Value> getAll(NullValue request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Uni<NullValue> clear(NullValue request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public Multi<Value> subscribeByStubContextId(IdStruct request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subscribeByStubContextId'");
    }
}
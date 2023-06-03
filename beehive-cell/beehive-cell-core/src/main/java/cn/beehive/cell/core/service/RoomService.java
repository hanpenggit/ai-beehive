package cn.beehive.cell.core.service;

import cn.beehive.base.domain.entity.RoomDO;
import cn.beehive.cell.core.domain.query.RoomPageQuery;
import cn.beehive.cell.core.domain.request.RoomCreateRequest;
import cn.beehive.cell.core.domain.request.RoomInfoEditRequest;
import cn.beehive.cell.core.domain.vo.RoomListVO;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author hncboy
 * @date 2023/5/29
 * 房间业务接口
 */
public interface RoomService extends IService<RoomDO> {

    /**
     * 分页查询房间
     *
     * @param roomPageQuery 分页查询参数
     * @return 房间分页列表
     */
    IPage<RoomListVO> pageRoom(RoomPageQuery roomPageQuery);

    /**
     * 创建房间
     *
     * @param roomCreateRequest 创建房间请求参数
     * @return 房间列表信息
     */
    RoomListVO createRoom(RoomCreateRequest roomCreateRequest);

    /**
     * 固定房间
     *
     * @param roomId 房间 id
     * @return 房间列表信息
     */
    RoomListVO pinRoom(Long roomId);

    /**
     * 编辑房间
     *
     * @param roomInfoEditRequest 编辑房间请求参数
     * @return 房间列表信息
     */
    RoomListVO editRoom(RoomInfoEditRequest roomInfoEditRequest);

    /**
     * 删除房间
     *
     * @param roomId 房间 id
     */
    void deleteRoom(Long roomId);
}
